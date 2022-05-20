package org.zerock.teamwebboard.service;


import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.dto.MemberDTO;

public interface MemberService {
    ListResponseDTO<MemberDTO> getMemberList(ListDTO listDTO);
    void memRemove(Integer memNo);
    void memUpdate(MemberDTO memberDTO);
    void memInsert(MemberDTO memberDTO);
    MemberDTO getMemberOne(Integer memNo);



}
