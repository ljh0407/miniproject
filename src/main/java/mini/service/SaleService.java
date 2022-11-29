package mini.service;

import mini.domain.dto.SaleDto;
import mini.domain.entity.SaleEntity;
import mini.domain.entity.SaleRepository;
import mini.domain.entity.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletRequest response;
    @Autowired
    private SaleRepository saleRepository;

    //--------- 서비스
    @Transactional
    public boolean setSale(SaleDto saleDto ){
        SaleEntity saleEntity = saleRepository.save(saleDto.toEntity());
        return true;
    }
    // int sname

    // 출력함
    public List<SaleDto> salelist(){
        List<SaleEntity> entityList = saleRepository.findAll();
        List<SaleDto> list = new ArrayList<>();
        for(SaleEntity  saleEntity: entityList ){
            list.add(saleEntity.toDto());
        }
        System.out.println("list확인"+list);
        return list;
    }

}
