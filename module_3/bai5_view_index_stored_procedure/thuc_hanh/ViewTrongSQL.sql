use mysqlsampledatabase;
-- create  view
CREATE VIEW customer_views AS
SELECT customerNumber, customerName, phone
FROM  customers;
select * from customer_views;

-- update view
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone
FROM customers
WHERE city = 'Nantes';

-- delete view
DROP VIEW customer_views;

