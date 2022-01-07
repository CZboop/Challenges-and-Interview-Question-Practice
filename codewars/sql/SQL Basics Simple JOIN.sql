SELECT products.id, products.name, company_id, isbn, price, 
companies.name AS company_name FROM products 
JOIN companies ON company_id = companies.id ORDER BY company_name;