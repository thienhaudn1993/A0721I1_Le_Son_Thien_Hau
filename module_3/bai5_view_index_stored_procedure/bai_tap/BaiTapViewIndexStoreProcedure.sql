create database demo_baitap5;
use demo_baitap5;
create table products(
Id int not null primary key auto_increment,
productCode	varchar(20),
productPrice double,
productAmount int,
productDescription varchar(50),
productStatus varchar(50)
);
alter table products add productName text after productCode;
insert into products value(1,"code1",16,5,"Chống nước","New");
insert into products values
(2,"code2","Hau2",14,2,"Chụp đêm","Used"),
(3,"code3","Hau3",14,2,"Chụp đêm","Used");
set SQL_SAFE_UPDATES = 0;
update products set productName ="Hau" where Id =1;
set SQL_SAFE_UPDATES = 1;
select * from products;
explain select * from products where productCode="code3";
create unique index idx_product_code on products(productCode);
explain select * from products where productCode="code3";
drop index idx_product_code on products;
create index idx_products on products(productName ,productPrice);

-- tạo view
create view products_view as
select productCode, productName, productPrice, productStatus
from products;
select * from products_view;

-- sửa view
create or replace view products_view as
select productCode, productName, productPrice, productDescription, productStatus
from products;
select * from products_view;

-- xóa view
drop view products_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //
create procedure find_all_product()
BEGIN
select * from products;
END //
DELIMITER ;
call find_all_product();

-- Tạo store procedure thêm một sản phẩm mới
DELIMITER //
create procedure add_new_product( 
in productCode varchar(50), 
in productName varchar(70),
in productPrice double,
in productAmount int,
in productDescription varchar(155),
in productStatus varchar(70)
)
BEGIN
insert into products(productCode, productName, productPrice, productAmount, productDescription, productStatus) 
values (productCode, productName, productPrice, productAmount, productDescription, productStatus);
END //
DELIMITER ;
call add_new_product("code4","Iphone 13",200,10,"pro max","New");
call add_new_product("code5","Iphone 12",150,5,"khoa id","Used");
select * from products;

-- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //
create procedure edit_product_by_id(
in id_edit int,
in productCode varchar(50), 
in productName varchar(70),
in productPrice double,
in productAmount int,
in productDescription varchar(155),
in productStatus varchar(70)
)
BEGIN
set SQL_SAFE_UPDATES = 0;
update products set 
productCode=productCode, 
productName=productName, 
productPrice=productPrice,
productAmount=productAmount,
productDescription=productDescription,
productStatus =productStatus
where Id =id_edit;
set SQL_SAFE_UPDATES = 1;
END //
DELIMITER ;
call edit_product_by_id(5,"code5","SamSung Note",2500,20,"chống nước","New");
select * from products;