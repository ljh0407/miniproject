package mini.domain.entity;

import mini.domain.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="store")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder @ToString
public class StoreEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stno;
}
