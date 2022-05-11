package org.zerock.teamwebboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.teamwebboard.domain.Admin;
import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.dto.AdminDTO;
import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.mapper.ContractMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2
public class ContractServiceImpl implements ContractService{
    private final ContractMapper contractMapper;
    private final ModelMapper modelMapper;

    @Override
    public ListResponseDTO<ContractDTO> getContractList(ListDTO listDTO) {
        List<Contract> collectorsList = contractMapper.selectContractList(listDTO);

        List<ContractDTO> dtoList =
                collectorsList.stream().map(contract -> modelMapper.map(contract, ContractDTO.class))
                        .collect(Collectors.toList());

        return ListResponseDTO.<ContractDTO>builder()
                .dtoList(dtoList)
                .total(contractMapper.getContractTotal(listDTO))
                .build();

    }
}
