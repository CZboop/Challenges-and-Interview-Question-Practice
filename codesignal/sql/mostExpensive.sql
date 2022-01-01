CREATE PROCEDURE solution()
BEGIN
	SELECT name FROM products ORDER BY price*quantity DESC, name LIMIT 1;
END