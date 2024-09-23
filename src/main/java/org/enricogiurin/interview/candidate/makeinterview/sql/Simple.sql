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




 update Product set price = 200 where  product_name like '%car%'

SELECT product_name, price
FROM Products
WHERE price > 100;

SELECT price, COUNT(*)
FROM Products
GROUP BY price
HAVING COUNT(*) > 3;
