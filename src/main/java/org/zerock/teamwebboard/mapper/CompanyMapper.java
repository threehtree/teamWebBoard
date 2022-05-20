package org.zerock.teamwebboard.mapper;

import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.domain.Company;
import org.zerock.teamwebboard.dto.ListDTO;

import java.util.List;

public interface CompanyMapper {
    List<Company> selectCompanyList(ListDTO listDTO);
    int getCompanyTotal(ListDTO listDTO);
    void updateAsRemove(Integer comNo);

}
