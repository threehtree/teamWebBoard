package org.zerock.teamwebboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.teamwebboard.domain.Board;
import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.domain.Member;
import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.dto.MemberDTO;
import org.zerock.teamwebboard.mapper.ContractMapper;
import org.zerock.teamwebboard.mapper.MemberMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2
public class MemberServiceImpl implements MemberService{
    private final MemberMapper memberMapper;
    private final ModelMapper modelMapper;

    @Override
    public ListResponseDTO<MemberDTO> getMemberList(ListDTO listDTO) {


//        List<Member> MemberList = memberMapper.selectMemberList(listDTO); //기존 리스트
        List<Member> MemberList = memberMapper.selectNoDeleteMemberList(listDTO);


        List<MemberDTO> dtoList =
                MemberList.stream().map(member -> modelMapper.map(member, MemberDTO.class))
                        .collect(Collectors.toList());

        return ListResponseDTO.<MemberDTO>builder()
                .dtoList(dtoList)
                .total(memberMapper.getMemberTotal(listDTO))
                .build();

    }

    @Override
    public void memRemove(Integer memNo) {
        memberMapper.updateAsRemove(memNo);
    }

    @Override
    public void memUpdate(MemberDTO MemberDTO) {
        log.info("==================================================");

        log.info("==================================================");

        log.info(MemberDTO);

        memberMapper.memUpdate(Member.builder()
                        .memNo(MemberDTO.getMemNo())
                        .memPhone(MemberDTO.getMemPhone())
                        .memAddress(MemberDTO.getMemAddress())
                        .memEmail(MemberDTO.getMemEmail())
                .build());

    }


    @Override
    public void memInsert(MemberDTO memberDTO) {
        memberMapper.memInsert(Member.builder()
                .memID(memberDTO.getMemID())
                .memName(memberDTO.getMemName())
                .memPhone(memberDTO.getMemPhone())
                .memEmail(memberDTO.getMemEmail())
                .memBirth(memberDTO.getMemBirth())
                .memAddress(memberDTO.getMemAddress())
                .memPW(memberDTO.getMemPW())
                .build());
    }

    @Override
    public MemberDTO getMemberOne(Integer memNo) {
        Member member = memberMapper.selectMemberOne(memNo);

        MemberDTO memberDTO = modelMapper.map(member, MemberDTO.class);
        return memberDTO;
    }

}
