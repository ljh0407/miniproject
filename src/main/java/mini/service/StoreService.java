package mini.service;

import mini.domain.dto.SaleDto;
import mini.domain.dto.StoreDto;
import mini.domain.entity.SaleEntity;
import mini.domain.entity.SaleRepository;
import mini.domain.entity.StoreEntity;
import mini.domain.entity.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

    @Autowired //매장
    private StoreRepository storeRepository ;
    @Autowired //상품
    private SaleRepository saleRepository;



    // -- 서비스
    @Transactional
    public boolean setstore(StoreDto storeDto){
        StoreEntity storeEntity = storeRepository.save(storeDto.toEntity());
        return true;
    }

    // 출력
    public List<StoreDto> storelist(){
        List<StoreEntity> entities = storeRepository.findAll();
        List<StoreDto> list = new ArrayList<>();
        for(StoreEntity storeEntity : entities){
            list.add(storeEntity.toDto());
        }
        return list;
    }









}




