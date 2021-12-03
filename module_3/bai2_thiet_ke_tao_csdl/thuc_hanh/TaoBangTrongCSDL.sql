create database QuanLyDiemThi;
use QuanLyDiemThi;
create table hoc_sinh(
ma_hs varchar(20) primary key,
ten_hs varchar(50),
ngay_sinh date,
lop varchar(20),
gt varchar(20)
);
select * from hoc_sinh;

create table mon_hoc(
ma_mh varchar(20) primary key,
ten_mh varchar(50)
);

select * from mon_hoc;

create table bang_diem(
ma_hs varchar(20),
ma_mh varchar(20),
primary key(ma_hs,ma_mh),
diem_thi int,
ngay_kt datetime,
foreign key(ma_hs) references hoc_sinh(ma_hs),
foreign key(ma_mh) references mon_hoc(ma_mh)
);

select * from bang_diem;

create table giao_vien(
ma_gv varchar(20) primary key,
ten_gv varchar(50),
sdt varchar(10)
);
select * from giao_vien;

alter table mon_hoc add ma_gv varchar(20);
alter table mon_hoc add constraint fk_ma_gv foreign key(ma_gv) references giao_vien(ma_gv);