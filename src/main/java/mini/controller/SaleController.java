package mini.controller;


import jdk.nashorn.internal.ir.RuntimeNode;
import mini.domain.dto.SaleDto;
import mini.domain.dto.StoreDto;
import mini.domain.entity.StoreRepository;
import mini.service.SaleService;
import mini.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/sale")

public class SaleController {

    //전역변수
   @Autowired
    private StoreService storeService ;
   @Autowired
    private SaleService saleService ;

    // ------------ HTML 반환 ?

    // sale 등록
  @GetMapping("/setsale")
  public Resource setSale(){
      return new ClassPathResource("view/index.html");
  }

   // -----------------------------------------------------------------------

    // 등록
    @PostMapping("/setsale")
    public int setsale(SaleDto saleDto){
      return saleService.setSale(saleDto);
    }

    // 출력함
    @GetMapping("/getsale")
    public List<SaleDto> salelist(@RequestBody SaleDto saleDto){
      return saleService.salelist();
    }





 }
