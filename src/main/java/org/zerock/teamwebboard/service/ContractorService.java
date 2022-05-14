package org.zerock.teamwebboard.service;

import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.ContractorDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;

public interface ContractorService {
    ListResponseDTO<ContractorDTO> getContractorList(ListDTO listDTO);
    void remove(Integer ctno);
}
