package org.zerock.teamwebboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.service.AdminService;

@Log4j2
@Controller
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/list")
    public void list(ListDTO listDTO, Model model){
        log.info("admin test............");
        log.info(listDTO );

        ListResponseDTO<AdminDTO> responseDTO = adminService.getAdminList(listDTO);

        model.addAttribute("ADdtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }


}
