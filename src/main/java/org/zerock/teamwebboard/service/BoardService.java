package org.zerock.teamwebboard.service;

import org.zerock.teamwebboard.dto.BoardDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;

public interface BoardService {

//    List<BoardDTO> getList(ListDTO listDTO); // 
    ListResponseDTO<BoardDTO> getList(ListDTO listDTO);

    BoardDTO getOne(Integer bno);

    void insert(BoardDTO boardDTO);

    void update(BoardDTO boardDTO);

    void remove(Integer bno);



}
