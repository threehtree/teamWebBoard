package org.zerock.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.teamwebboard.domain.Requester;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.mapper.RequesterMapper;

import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")

public class RequesterMapperTests {
    @Autowired(required = false)
    private RequesterMapper requesterMapper;

    @Test
    public void testSelectList() {
        ListDTO listDTO = new ListDTO();
        List<Requester> requesterList = requesterMapper.selectRequesterList(listDTO);
        requesterList.forEach(requester -> log.info(requester));
    }

    @Test
    public void testRequesterGetTotal() {
        ListDTO listDTO = new ListDTO();
        log.info(requesterMapper.getRequesterTotal(listDTO));

    }
}