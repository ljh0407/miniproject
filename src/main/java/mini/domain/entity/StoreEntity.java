package mini.domain.entity;

import mini.domain.BaseEntity;
import lombok.*;
import mini.domain.dto.SaleDto;
import mini.domain.dto.StoreDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="store")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder @ToString
public class StoreEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stno;
    private String stname;

    @OneToMany( mappedBy = "storeEntity")
    @Builder.Default
    @ToString.Exclude
    private List<SaleEntity> saleEntityList = new ArrayList<>();

    public StoreDto toDto(){
        return  StoreDto.builder()
                .stno(this.stno)
                .stname(this.stname)
                .build();
    }

}
