package org.zerock.teamwebboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.mapper.ContractorMapper;
import org.zerock.teamwebboard.service.AdminService;
import org.zerock.teamwebboard.service.ContractService;
import org.zerock.teamwebboard.service.ContractorService;

@Log4j2
@Controller
@RequestMapping("/admin/contract/")
@RequiredArgsConstructor
public class ContractController {
    private final ContractService contractService;

    @GetMapping("/list")
    public void list(ListDTO listDTO, Model model){
        log.info("contract test............");
        log.info(listDTO );

        ListResponseDTO<ContractDTO> responseDTO = contractService.getContractList(listDTO);

        model.addAttribute("CONdtoList",responseDTO.getDtoList());

        int total = responseDTO. getTotal();
        model.addAttribute("pageMaker",new PageMaker(listDTO.getPage(),total));

    }


}
