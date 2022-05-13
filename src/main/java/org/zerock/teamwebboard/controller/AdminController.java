package org.zerock.teamwebboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.service.AdminService;

import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @DeleteMapping("/{adno}")
    @ResponseBody
    public Map<String, String> delete(@PathVariable("adno") Integer adno){

        log.info("============================");
        log.info("============================");
        log.info("remove...."+adno);
        log.info("============================");
        adminService.remove(adno);
        return Map.of("data","Del");
    }

    @GetMapping("/adminList")
    public void list(ListDTO listDTO, Model model){
        log.info("adminList test............");
        log.info(listDTO );

        ListResponseDTO<AdminDTO> responseDTO = adminService.getAdminList(listDTO);

        model.addAttribute("adDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));
        model.addAttribute("aa","Delete");
    }



}
