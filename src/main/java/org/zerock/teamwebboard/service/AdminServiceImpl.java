package org.zerock.teamwebboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.teamwebboard.domain.Admin;
import org.zerock.teamwebboard.domain.Board;
import org.zerock.teamwebboard.dto.AdminDTO;
import org.zerock.teamwebboard.dto.BoardDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.mapper.AdminMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2

public class AdminServiceImpl implements AdminService{

    private final AdminMapper adminMapper;
    private final ModelMapper modelMapper;

    @Override
    public ListResponseDTO<AdminDTO> getAdminList(ListDTO listDTO) {
        List<Admin> adminList = adminMapper.selectAdminList(listDTO);

        List<AdminDTO> dtoList =
                adminList.stream().map(admin -> modelMapper.map(admin, AdminDTO.class))
                        .collect(Collectors.toList());

        return ListResponseDTO.<AdminDTO>builder()
                .dtoList(dtoList)
                .total(adminMapper.getAdminTotal(listDTO))
                .build();
    }
}
