package org.zerock.teamwebboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.mapper.CompanyMapper;
import org.zerock.teamwebboard.service.AdminService;
import org.zerock.teamwebboard.service.CompanyService;

import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/company/")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

    @DeleteMapping("/delete/{comNo}")
    @ResponseBody
    public Map<String, String> delete(@PathVariable("comNo") Integer comNo){

        log.info("============================");
        log.info("============================");
        log.info("remove...."+comNo);
        log.info("============================");
        companyService.remove(comNo);
        return Map.of("data","Del");
    }

    @GetMapping("/mypage")
    public void mypage(ListDTO listDTO, Model model){
        log.info("Company test............");
        log.info(listDTO );

        ListResponseDTO<CompanyDTO> responseDTO = companyService.getCompanyList(listDTO);

        model.addAttribute("comDtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }


}
