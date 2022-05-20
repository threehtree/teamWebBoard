package org.zerock.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.teamwebboard.domain.Member;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.mapper.MemberMapper;

import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")

public class MemberMapperTests {
    @Autowired(required = false)
    private MemberMapper MemberMapper;

    @Test
    public void testSelectList() {
        ListDTO listDTO = new ListDTO();
        List<Member> MemberList = MemberMapper.selectMemberList(listDTO);
        MemberList.forEach(Member -> log.info(Member));
    }

    @Test
    public void testMemberGetTotal() {
        ListDTO listDTO = new ListDTO();
        log.info(MemberMapper.getMemberTotal(listDTO));

    }
    @Test
    public void testMemberDel(){
        int memNo = 5;
        MemberMapper.updateAsRemove(5);
    }

    @Test
    public void testMemberInsert(){
        Member member = Member.builder()
                .memID("아이디")
                .memName("이름")
                .memPhone("010-7797-2654")
                .build();
        MemberMapper.memInsert(member);
    }

    @Test
    public void testNoDelSelectList(){
        ListDTO listDTO = new ListDTO();
        List<Member> MemberList = MemberMapper.selectNoDeleteMemberList(listDTO);
        MemberList.forEach(Member -> log.info(Member));
    }

    @Test
    public void testSelectOne(){

        log.info(MemberMapper.selectMemberOne(17));

    }

    @Test
    public void testUpdate(){
        Member member = Member.builder()
                .memPhone("01056792697")
                .memAddress("주우우우우ㅜ소")
                .memEmail("ddddddd@DDDDDDDDDDdddddddd")
                .memPhone("010-7797-2654")
                .build();
        MemberMapper.memUpdate(member);

    }
}