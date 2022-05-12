package org.zerock.teamwebboard.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.teamwebboard.domain.Admin;
import org.zerock.teamwebboard.dto.ListDTO;

import java.util.List;

public interface AdminMapper {
    List<Admin> selectAdminList(ListDTO listDTO);
    int getAdminTotal(ListDTO listDTO);
    void updateAsRemove(Integer adno);
}
