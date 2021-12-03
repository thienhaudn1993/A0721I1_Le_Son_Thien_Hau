create database XayDungCSDLQuanLyBanHang;
use XayDungCSDLQuanLyBanHang;
create table customer(
cID int not null primary key auto_increment,
cName varchar(50) not null,
cAge int not null
);

create table product(
pID int not null primary key auto_increment,
pName  varchar(50) not null,
pPrice double not null
);

create table `order`(
oID int not null primary key auto_increment,
cID int not null,
oDate date not null,
oTotalPrice double not null,
foreign key(cID) references customer(cID)
);

create table order_detail(
oID int not null,
pID int not null,
odQTY int not null,
primary key(oID,pID),
foreign key(oID) references `order`(oID),
foreign key(pID) references product(pID)
);