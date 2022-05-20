package org.zerock.teamwebboard.mapper;

import org.zerock.teamwebboard.domain.Member;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {
    List<Member> selectMemberList(ListDTO listDTO);
    int getMemberTotal(ListDTO listDTO);
    void updateAsRemove(Integer reqno);
    void memInsert(Member member);
    List<Member> selectNoDeleteMemberList(ListDTO listDTO);
    Member selectMemberOne(Integer memNo);
    void memUpdate(Member member);
}
