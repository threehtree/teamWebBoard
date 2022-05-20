package org.zerock.teamwebboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.domain.Company;
import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.CompanyDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.mapper.CompanyMapper;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
@Log4j2
public class CompanyServiceImpl implements CompanyService{

    private final CompanyMapper companyMapper;
    private final ModelMapper modelMapper;


    public ListResponseDTO<CompanyDTO> getCompanyList(ListDTO listDTO) {
        List<Company> collectorsList = companyMapper.selectCompanyList(listDTO);

        List<CompanyDTO> dtoList =
                collectorsList.stream().map(company -> modelMapper.map(company, CompanyDTO.class))
                        .collect(Collectors.toList());

        return ListResponseDTO.<CompanyDTO>builder()
                .dtoList(dtoList)
                .total(companyMapper.getCompanyTotal(listDTO))
                .build();

    }

    @Override
    public void remove(Integer comNo) {
        companyMapper.updateAsRemove(comNo);
    }
}
