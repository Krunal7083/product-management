package project.product.management.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import project.product.management.entity.Product;

public interface ProductReposetry extends JpaRepository<Product, Long>
{

}
