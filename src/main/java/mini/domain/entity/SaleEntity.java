package mini.domain.entity;

import mini.domain.BaseEntity;
import lombok.*;
import mini.domain.dto.SaleDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sale")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class SaleEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;
    private String sname;
    private int sprice;

    @OneToMany( mappedBy = "saleEntity")
    @Builder.Default
    private List<StoreEntity> storeEntityList = new ArrayList<>();

    public SaleDto toDto(){
        return  SaleDto.builder()
                .sno(this.sno)
                .sname(this.sname)
                .sprice(this.sprice)
                .build();
    }

}
