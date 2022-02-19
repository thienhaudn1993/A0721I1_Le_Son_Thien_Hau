create database TComplex;
use TComplex;
create table tcomplex (
ma_db varchar(45),
dien_tich double,
trang_thai varchar(45),
tang int,
loai_van_phong varchar(45),
gia_cho_thue double,
ngay_bat_dau date,
ngay_ket_thuc date
);
insert into tcomplex values ("MB001",100,"Trống",2,"Cho thuê",2000000,"2020-11-20","2021-11-25");
insert into tcomplex values ("MB002",240,"Trống",5,"Trọn gói",5000000,"2020-04-03","2020-10-03");