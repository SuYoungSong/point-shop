package swim.pointshop.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import swim.pointshop.common.jpa.CommonDateEntity;

import java.math.BigDecimal;

@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product extends CommonDateEntity {

    @Id @GeneratedValue
    private long id;
    private String name;
    private String desc;
    private BigDecimal amount;
    private Integer quantity;
}
