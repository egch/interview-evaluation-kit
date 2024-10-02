/*
 Product
 +--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| product_id   | int     |
| product_name | varchar |
| price        | int     |
+--------------+---------+

 Problem: change the price to 200 to the all the products containing the word 'Car' in product_name
 Problem: return all the products having price >=200 sorted by id desc
 Problem: return all the products containing the word 'Car' in product_name, sorted by id desc
 */



 /*
  Order
 +--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| order_id     | int     |
| product_id   | int     | -- Foreign key to Product table
| quantity     | int     |
| order_date   | date    |
+--------------+---------+
  */

/**
  Write an SQL query to retrieve all the orders for a specific product, identified by its name (e.g., 'Smartphone').
 */


SELECT Product.product_id, Product.product_name, Product.price, Order.order_id, Order.quantity, Order.order_date
FROM Product
         INNER JOIN Order ON Product.product_id = Order.product_id
WHERE Product.product_name = 'Smartphone';

 update Product set price = 200 where  product_name like '%car%'

SELECT product_name, price
FROM Products
WHERE price > 100;

SELECT price, COUNT(*)
FROM Products
GROUP BY price
HAVING COUNT(*) > 3;
