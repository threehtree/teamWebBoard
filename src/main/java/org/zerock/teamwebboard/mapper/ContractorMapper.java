package org.zerock.teamwebboard.mapper;

import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.domain.Contractor;
import org.zerock.teamwebboard.dto.ListDTO;

import java.util.List;

public interface ContractorMapper {
    List<Contractor> selectContractorList(ListDTO listDTO);
    int getContractorTotal(ListDTO listDTO);
    void updateAsRemove(Integer ctno);

}
