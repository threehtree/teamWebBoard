package org.zerock.teamwebboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.service.AdminService;
import org.zerock.teamwebboard.service.ContractService;
import org.zerock.teamwebboard.service.CompanyService;
import org.zerock.teamwebboard.service.MemberService;

import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final ContractService contractService;
    private final CompanyService CompanyService;
    private final MemberService MemberService;

//    @DeleteMapping("/delete/{adNo}")
//    @ResponseBody
//    public Map<String, String> delete(@PathVariable("adNo") Integer adNo){
//
//        log.info("============================");
//        log.info("============================");
//        log.info("remove...."+adNo);
//        log.info("============================");
//        adminService.remove(adNo);
//        return Map.of("data","Del");
//    }


    @GetMapping("/adminList")
    public void adminList(ListDTO listDTO, Model model){
        log.info("adminList test............");
        log.info(listDTO );

        ListResponseDTO<AdminDTO> responseDTO = adminService.getAdminList(listDTO);

        model.addAttribute("adDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));
        model.addAttribute("aa","Delete");
    }

    @GetMapping("/contractList")
    public void contractList(ListDTO listDTO, Model model){
        log.info("contractList test............");
        log.info(listDTO );

        ListResponseDTO<ContractDTO> responseDTO = contractService.getContractList(listDTO);

        model.addAttribute("conDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }
    @GetMapping("/CompanyList")
    public void list(ListDTO listDTO, Model model){
        log.info("Company test............");
        log.info(listDTO );

        ListResponseDTO<CompanyDTO> responseDTO = CompanyService.getCompanyList(listDTO);

        model.addAttribute("ctDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }

    @GetMapping("/MemberList")
    public void MemberList(ListDTO listDTO, Model model){
        log.info("Member test............");
        log.info(listDTO );

        ListResponseDTO<MemberDTO> responseDTO = MemberService.getMemberList(listDTO);

        model.addAttribute("reqDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }




}
