package org.zerock.teamwebboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.teamwebboard.domain.Board;
import org.zerock.teamwebboard.domain.Requester;
import org.zerock.teamwebboard.dto.BoardDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.dto.RequesterDTO;
import org.zerock.teamwebboard.mapper.BoardMapper;
import org.zerock.teamwebboard.mapper.RequesterMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2
public class RequesterServiceImpl implements RequesterService{
    private final RequesterMapper requesterMapper;
    private final ModelMapper modelMapper;

    @Override
    public ListResponseDTO<RequesterDTO> getRequesterList(ListDTO listDTO) {
        List<Requester> requesterList = requesterMapper.selectList(listDTO); //.getSkip(),listDTO.getSize()

        // vo -> dto 타입으로 변화 추가
        List<RequesterDTO> dtoList =
                requesterList.stream().map(requester -> modelMapper.map(requester, RequesterDTO.class))
                        .collect(Collectors.toList());

        requesterMapper.columnName();

        return ListResponseDTO.<RequesterDTO>builder()
                .dtoList(dtoList)
                .total(requesterMapper.requesterGetTotal(listDTO))
                .build();
    }

    @Override
    public String[] getColumns() {

        log.info("-------------------------");
        log.info(requesterMapper.columnName());
        log.info("-------------------------");

        return requesterMapper.columnName();
    }
}
