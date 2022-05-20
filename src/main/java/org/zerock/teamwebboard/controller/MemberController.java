package org.zerock.teamwebboard.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.service.MemberService;

import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/member/")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/mypage/{memNo}")
    public String myPage(@PathVariable("memNo") Integer memNo, ListDTO listDTO, Model model){

        MemberDTO memberDTO = memberService.getMemberOne(memNo);
        model.addAttribute("memDtoOne",memberDTO);
        //여기에 @PathVariable로 id값을 가져오거나 시큐리티의 로그인정보로
        // 값을 가져와서 넣어야 할 것 같다
        return "/member/mypage";
        //현재 /member/mypage/memNO 이렇게 뜨는데
        //memNo를 가져오되 url을 /member/mypage로 가져올 방법이 있을까요?
        //아니면 다른 방법으로 회원정보를 가져올 방법이 있을까
    }


    @GetMapping("/mycontract")
    public void getMyContract(ListDTO listDTO, Model model){
        log.info("Member test............");
        log.info(listDTO );

        ListResponseDTO<MemberDTO> responseDTO = memberService.getMemberList(listDTO);

        model.addAttribute("memDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }

    @DeleteMapping("/delete/{memNo}")
    @ResponseBody
    public Map<String, String> delete(@PathVariable("memNo") Integer memNo){

        log.info("============================");
        log.info("============================");
        log.info("remove...."+memNo);
        log.info("============================");
        memberService.memRemove(memNo);
        return Map.of("data","Del");
    }

    @PostMapping("/modify/{memNo}")
    public String removeReqPost(@PathVariable ("memNo") Integer memNo, MemberDTO memberDTO, ListDTO listDTO, RedirectAttributes rttr ){
        log.info("----------------------");
        log.info("----------------------");
        memberDTO.setMemNo(memNo);
        log.info("modify" + memberDTO);

        log.info("----------------------");
        log.info(memberDTO.getMemID());
        log.info(memberDTO.getMemBirth());
        log.info("----------------------");

        memberService.memUpdate(memberDTO);

        rttr.addFlashAttribute("result", "reqmodified");

        log.info("----------------------");

//        return "redirect:/admin/Member/list/"+memNo+ listDTO.getLink();
//        return null;
        return "redirect:/member/mypage/"+memNo;
    }
    @GetMapping("/modify/{memNo}")
    public String modifyGET(@PathVariable ("memNo") Integer memNo, ListDTO listDTO, Model model){

        log.info(memNo);

        log.info(listDTO);

        model.addAttribute("memDtoOne", memberService.getMemberOne(memNo));

        return "/member/modify";


    }
    @PostMapping("/register")
    public String registerPOST(MemberDTO memberDTO, RedirectAttributes rttr){

        log.info("----------------------");
        log.info(memberDTO);
        memberService.memInsert(memberDTO);
        rttr.addFlashAttribute("result", "insert");
        return "member/mycontract";
    }
    @GetMapping("/register")
    public void registerGET(){

    }

}
