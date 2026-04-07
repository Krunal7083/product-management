package project.product.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import project.product.management.entity.Product;
import project.product.management.reposetry.ProductReposetry;

@Service
public class ProductServiceImplementation implements ProductService {

	ProductReposetry repo;
	
	
	public ProductServiceImplementation(ProductReposetry repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addProduct(Product prod) {
		repo.save(prod);
		return "Product added successfully!";
	}

	@Override
	public String updateProduct(Product prod) {
		repo.save(prod);
		return "Product Updated successfully!";
	}

	@Override
	public String deleteProduct(Long prodId) {
		 repo.deleteById(prodId);
		return "Product deleted successfully!";
	}


	@Override
	public Product viewPoint(Long prodId) {
		return repo.findById(prodId).get();
		
	}

	@Override
	public List<Product> viewAllProducts() {
		return repo.findAll();
	}

	
	
	
	
}
