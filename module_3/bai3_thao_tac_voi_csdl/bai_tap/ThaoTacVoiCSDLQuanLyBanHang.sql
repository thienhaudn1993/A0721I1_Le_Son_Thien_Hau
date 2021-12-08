create database quan_ly_ban_hang_bt2;
use quan_ly_ban_hang_bt2;
create table customer(
c_id int primary key auto_increment,
c_name varchar(30),
c_age int not null
);
insert into customer(c_name, c_age) values
("Minh Quan", 10),
("Ngoc Oanh", 20),
("Hong Ha", 50);
create table product(
p_id int primary key auto_increment,
p_name varchar(30),
p_price int not null
);
insert into product(p_name,p_price) values
("May Giat", 3),
("Tu Lanh", 5),
("Dieu Hoa", 7),
("Quat", 1),
("Bep Dien",2);

create table `order`(
o_id int primary key auto_increment,
o_date date,
o_total_price double,
c_id int not null,
foreign key (c_id) references customer(c_id)
);
insert into `order`(o_date, c_id) values
("2006-3-21",1),
("2006-3-23",2),
("2006-3-16",1);
create table order_detail(
od_qty int not null,
o_id int,
p_id int,
primary key(o_id, p_id),
foreign key (o_id) references `order`(o_id),
foreign key (p_id) references product(p_id)
);
select * from order_detail;
insert into order_detail values 
(3,1,1),
(7,1,3),
(1,2,1),
(8,3,1),
(4,2,5);
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select `order`.o_id, o_date, p_price from order_detail 
inner join product on product.p_id = order_detail.p_id 
inner join `order` on `order`.o_id = order_detail.o_id;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c_name, `order`.o_id, o_date, p_name, product.p_id from `order` 
inner join order_detail on `order`.o_id = order_detail.o_id 
inner join customer on `order`.c_id=customer.c_id 
inner join product on order_detail.p_id = product.p_id; 

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select * from customer where not exists(select `order`.c_id from `order` where customer.c_id = `order`.c_id);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select od_qty*p_price as total, o_date, order_detail.o_id from order_detail inner join product on order_detail.p_id = product.p_id  inner join `order` on `order`.o_id = order_detail.o_id ;