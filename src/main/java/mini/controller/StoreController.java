package mini.controller;

import mini.domain.dto.StoreDto;
import mini.service.StoreService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@RestController
public class StoreController {


     /*@GetMapping("/store")
    public Resource.getstore(){
        return new ClassPathResource("/view/index.html");
    }*/



   /* @PostMapping("/setstore")
    public boolean setStore(StoreDto storeDto){
        System.out.println("확인 : " + StoreDto.toString);
        return StoreService.setStore(storeDto);
    }*/
}
