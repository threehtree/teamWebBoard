package org.zerock.teamwebboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.teamwebboard.dto.*;
import org.zerock.teamwebboard.service.RequesterService;

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


}
