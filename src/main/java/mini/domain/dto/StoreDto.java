package mini.domain.dto;

import lombok.*;
import mini.domain.entity.SaleEntity;
import mini.domain.entity.StoreEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class StoreDto {
    private int stno;
    private String stname;


    public StoreEntity toEntity(){
        return  StoreEntity.builder()
                .stno(this.stno)
                .stname(this.stname)
                .build();
    }
}
