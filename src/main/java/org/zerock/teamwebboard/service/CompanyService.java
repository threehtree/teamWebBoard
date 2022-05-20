package org.zerock.teamwebboard.service;

import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.CompanyDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;

public interface CompanyService {
    ListResponseDTO<CompanyDTO> getCompanyList(ListDTO listDTO);
    void remove(Integer comNo);
}
