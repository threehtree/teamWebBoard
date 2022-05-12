package org.zerock.teamwebboard.service;

import org.zerock.teamwebboard.domain.Admin;
import org.zerock.teamwebboard.dto.AdminDTO;
import org.zerock.teamwebboard.dto.BoardDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;

public interface AdminService {
    ListResponseDTO<AdminDTO> getAdminList(ListDTO listDTO);
    void remove(Integer adno);
}
