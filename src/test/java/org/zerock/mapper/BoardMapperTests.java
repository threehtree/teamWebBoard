package org.zerock.mapper;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.zerock.teamwebboard.domain.Board;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.mapper.BoardMapper;

import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")

public class BoardMapperTests {

    @Autowired(required = false)
    private BoardMapper boardMapper;


    @Test
    public void testSelectList(){
        ListDTO listDTO = new ListDTO();
        List<Board> boardList = boardMapper.selectList(listDTO);
        boardList.forEach(board ->log.info(board));
    }

}
