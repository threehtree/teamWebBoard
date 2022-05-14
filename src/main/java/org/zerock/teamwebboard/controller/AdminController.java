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
import org.zerock.teamwebboard.service.ContractorService;
import org.zerock.teamwebboard.service.RequesterService;

import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final ContractService contractService;
    private final ContractorService contractorService;
    private final RequesterService requesterService;

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
    @GetMapping("/contractorList")
    public void list(ListDTO listDTO, Model model){
        log.info("contractor test............");
        log.info(listDTO );

        ListResponseDTO<ContractorDTO> responseDTO = contractorService.getContractorList(listDTO);

        model.addAttribute("ctDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }

    @GetMapping("/requesterList")
    public void requesterList(ListDTO listDTO, Model model){
        log.info("Requester test............");
        log.info(listDTO );

        ListResponseDTO<RequesterDTO> responseDTO = requesterService.getRequesterList(listDTO);

        model.addAttribute("reqDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }




}
