package mini.service;

import mini.domain.dto.StoreDto;
import mini.domain.entity.StoreEntity;
import mini.domain.entity.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository ;
    @Autowired
    private HttpServletRequest  request ;
    @Autowired
    private StoreEntity storeEntity ;
    @Autowired
    private StoreService storeService ;

    // -- 서비스
    @Transactional
    public int setstore(StoreDto storeDto){
        StoreEntity storeEntity = storeRepository.save(storeDto.toEntity());
        return storeEntity.getStno();
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




