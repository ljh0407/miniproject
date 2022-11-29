package mini.domain.entity;

import mini.domain.BaseEntity;
import lombok.*;

import javax.persistence.*;

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
}
