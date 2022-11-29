package mini.controller;

import mini.domain.dto.StoreDto;
import mini.domain.entity.StoreEntity;
import mini.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController
@RequestMapping("/store")
public class StoreController {
    // 전역변수
    @Autowired
    private StoreService storeService;


    // HTML 반환
    @GetMapping("/storelist")
    public Resource setstore(){
        return new ClassPathResource("view/index.html");
    }


    //등록
    @PostMapping("/setstore")
    public boolean setstore(@RequestBody StoreDto storeDto){
        return storeService.setstore(storeDto);
    }

    // 출력
    @GetMapping("/getstore")
    public List<StoreDto> salelist(){
        return storeService.storelist();
    }






}
