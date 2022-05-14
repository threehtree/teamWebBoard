package org.zerock.teamwebboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.domain.Contractor;
import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.ContractorDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.mapper.ContractorMapper;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
@Log4j2
public class ContractorServiceImpl implements ContractorService{

    private final ContractorMapper contractorMapper;
    private final ModelMapper modelMapper;


    public ListResponseDTO<ContractorDTO> getContractorList(ListDTO listDTO) {
        List<Contractor> collectorsList = contractorMapper.selectContractorList(listDTO);

        List<ContractorDTO> dtoList =
                collectorsList.stream().map(Contractor -> modelMapper.map(Contractor, ContractorDTO.class))
                        .collect(Collectors.toList());

        return ListResponseDTO.<ContractorDTO>builder()
                .dtoList(dtoList)
                .total(contractorMapper.getContractorTotal(listDTO))
                .build();

    }

    @Override
    public void remove(Integer ctno) {
        contractorMapper.updateAsRemove(ctno);
    }
}
