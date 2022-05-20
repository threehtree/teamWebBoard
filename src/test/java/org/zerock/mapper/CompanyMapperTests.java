package org.zerock.mapper;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.mapper.CompanyMapper;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")

public class CompanyMapperTests {
    @Autowired(required = false)
    private CompanyMapper CompanyMapper;

    @Test
    public void testCompany(){
        ListDTO listDTO = new ListDTO();
        CompanyMapper.getCompanyTotal(listDTO);
    }
    @Test
    public void testgetCompanyTotal(){
        ListDTO listDTO = new ListDTO();
        CompanyMapper.getCompanyTotal(listDTO);
    }
    @Test
    public void testgetCompanyList(){

        CompanyMapper.selectCompanyList(new ListDTO());
    }

    @Test
    public void testCompanyDel(){

        int comNo = 12;
        CompanyMapper.updateAsRemove(12);
    }


}
