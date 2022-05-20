package org.zerock.teamwebboard.mapper;

import org.zerock.teamwebboard.domain.Admin;
import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.dto.ListDTO;

import java.util.List;

public interface ContractMapper {
    List<Contract> selectContractList(ListDTO listDTO);
    int getContractTotal(ListDTO listDTO);
    void updateAsRemove(Contract contract);
    void conInsert(Contract contract);
    List<Contract> selectNoDeleteContractList(ListDTO listDTO);

}
