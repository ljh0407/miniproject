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


    @ManyToOne  // [1:n]fk에 해당 어노테이션
    @JoinColumn(name="stno") // 테이블에서 사용할 fk의 필드명 정의
    @ToString.Exclude   // 해당 필드는 ToString 사용하지 않는다. (안하면 무한루프돔) [ 양방향일때는 필수!! ]
    private StoreEntity storeEntity;// pk에 엔티티 객체

    public SaleDto toDto(){
        return  SaleDto.builder()
                .sno(this.sno)
                .sname(this.sname)
                .sprice(this.sprice)
                .build();
    }

}
