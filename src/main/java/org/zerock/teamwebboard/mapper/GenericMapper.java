package org.zerock.teamwebboard.mapper;

import org.zerock.teamwebboard.domain.Board;
import org.zerock.teamwebboard.dto.ListDTO;

import java.util.List;

public interface GenericMapper <E,K> {

    void insert(E board);

    //@Param("skip") int skip, @Param("size") int size
    List<Board> selectList(ListDTO listDTO);

    int getTotal(ListDTO listDTO);

    void delete(K bno);

    Board selectOne(K bno);

    void update(E board);


}


