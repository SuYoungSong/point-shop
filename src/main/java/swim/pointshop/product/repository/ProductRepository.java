package swim.pointshop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swim.pointshop.product.domain.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
}
