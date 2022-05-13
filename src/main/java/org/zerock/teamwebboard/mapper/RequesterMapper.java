package org.zerock.teamwebboard.mapper;

import org.zerock.teamwebboard.domain.Requester;
import org.zerock.teamwebboard.dto.ListDTO;

import java.util.List;

public interface RequesterMapper {
    List<Requester> selectRequesterList(ListDTO listDTO);
    int getRequesterTotal(ListDTO listDTO);
    void updateAsRemove(Integer reqno);
}
