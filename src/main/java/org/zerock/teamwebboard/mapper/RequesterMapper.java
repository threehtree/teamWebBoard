package org.zerock.teamwebboard.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.teamwebboard.domain.Requester;
import org.zerock.teamwebboard.dto.ListDTO;

import java.util.List;

public interface RequesterMapper {
    List<Requester> selectList(ListDTO listDTO);
    int requesterGetTotal(ListDTO listDTO);
    String[] columnName();
}
