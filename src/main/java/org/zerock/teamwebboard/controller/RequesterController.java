package org.zerock.teamwebboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.service.RequesterService;

import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/admin/requester/")
@RequiredArgsConstructor
public class RequesterController {
    private final RequesterService requesterService;


    @GetMapping("/list")
    public void list(ListDTO listDTO, Model model){
        log.info("Requester test............");
        log.info(listDTO );

        ListResponseDTO<RequesterDTO> responseDTO = requesterService.getRequesterList(listDTO);

        model.addAttribute("reqDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }

    @DeleteMapping("/delete/{reqno}")
    @ResponseBody
    public Map<String, String> delete(@PathVariable("reqno") Integer reqno){

        log.info("============================");
        log.info("============================");
        log.info("remove...."+reqno);
        log.info("============================");
        requesterService.remove(reqno);
        return Map.of("data","Del");
    }

    @PostMapping("/modify/{reqno}")
    public String removeReqPost(@PathVariable ("reqno") Integer reqno, RequesterDTO requesterDTO, ListDTO listDTO, RedirectAttributes rttr ){
        log.info("----------------------");
        log.info("----------------------");
        requesterDTO.setReqno(reqno);
        log.info("modify" + requesterDTO);

        requesterService.update(requesterDTO);

        rttr.addFlashAttribute("result", "reqmodified");

        log.info("----------------------");

        return "redirect:/admin/requester/list/"+reqno+ listDTO.getLink();



//        return null;
    }

}
