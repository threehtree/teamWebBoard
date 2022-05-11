package org.zerock.teamwebboard.service;

import org.zerock.teamwebboard.dto.AdminDTO;
import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;

public interface ContractService {
    ListResponseDTO<ContractDTO> getContractList(ListDTO listDTO);
}
