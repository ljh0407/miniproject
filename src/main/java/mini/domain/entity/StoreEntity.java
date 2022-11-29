package mini.domain.entity;

import mini.domain.BaseEntity;
import lombok.*;
import mini.domain.dto.SaleDto;
import mini.domain.dto.StoreDto;

import javax.persistence.*;

@Entity
@Table(name="store")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder @ToString
public class StoreEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stno;
    private String stname;


    @ManyToOne  // [1:n]fk에 해당 어노테이션
    @JoinColumn(name="sno") // 테이블에서 사용할 fk의 필드명 정의
    @ToString.Exclude   // 해당 필드는 ToString 사용하지 않는다. (안하면 무한루프돔) [ 양방향일때는 필수!! ]
    private SaleEntity saleEntity;// pk에 엔티티 객체

    public StoreDto toDto(){
        return  StoreDto.builder()
                .stno(this.stno)
                .stname(this.stname)
                .build();
    }

}
