package org.enricogiurin.interview.candidate.makeinterview.jpa;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

interface ProductRepository extends JpaRepository<Product, Integer> {

}


/*
 Product
 +--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| product_id   | int     |
| product_name | varchar |
| price        | int     |
+--------------+---------+


Q:

Describe how you would write Java code to:

Fetch all rows from this table.
Insert a new row into the table.
 */

public class AccessToProduct {

}

@Data
class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int productId;
  private String productName;
  private int price;
}

class ProductDAO {

  private final JdbcTemplate jdbcTemplate;

  public ProductDAO(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  // Fetch all products
  public List<Product> getAllProducts() {
    String query = "SELECT * FROM Product";
    return jdbcTemplate.query(query, new ProductRowMapper());
  }

  // Insert a new product
  public void insertProduct(Product product) {
    String query = "INSERT INTO Product (product_name, price) VALUES (?, ?)";
    jdbcTemplate.update(query, product.getProductName(), product.getPrice());
  }

  // RowMapper for Product
  private static class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
      Product product = new Product();
      product.setProductId(rs.getInt("product_id"));
      product.setProductName(rs.getString("product_name"));
      product.setPrice(rs.getInt("price"));
      return product;
    }
  }
}