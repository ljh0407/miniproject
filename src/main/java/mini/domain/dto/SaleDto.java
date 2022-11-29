package mini.domain.dto;

import lombok.*;
import mini.domain.entity.SaleEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class SaleDto {

    private int sno;
    private String sname;
    private int sprice;

    public SaleEntity toEntity(){
        return  SaleEntity.builder()
                .sno(this.sno)
                .sname(this.sname)
                .sprice(this.sprice)
                .build();
    }
}
