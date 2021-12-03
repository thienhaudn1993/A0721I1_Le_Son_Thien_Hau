create database ChuyenDoiERDSangMoHinhQuanHe;
use ChuyenDoiERDSangMoHinhQuanHe;

create table phieu_xuat(
so_px int primary key auto_increment,
ngay_xuat date
);

create table vat_tu(
ma_vtu int primary key auto_increment,
ten_vtu varchar(50)
);

create table phieu_nhap(
so_pn int primary key auto_increment,
ngay_nhap date
);

create table nha_cc(
ma_ncc int primary key auto_increment,
ten_ncc varchar(70),
dia_chi varchar(70),
sdt varchar(10)
);

create table don_dh(
so_dh int primary key auto_increment,
ngay_dh date,
ma_ncc int,
foreign key(ma_ncc) references nha_cc(ma_ncc)
);



create table sdt(
ma_sdt int primary key auto_increment,
sdt varchar(10),
ma_ncc int,
foreign key(ma_ncc) references nha_cc(ma_ncc)
);

create table phieu_xuat_vat_tu(
dg_xuat varchar(20),
sl_xuat int,
so_px int,
ma_vtu int,
primary key(so_px,ma_vtu),
foreign key(so_px) references phieu_xuat(so_px),
foreign key(ma_vtu) references vat_tu(ma_vtu)
);

create table vat_tu_phieu_nhap(
dg_nhap varchar(20),
sl_nhap int,
ma_vtu int,
so_pn int,
primary key(ma_vtu,so_pn),
foreign key(ma_vtu) references vat_tu(ma_vtu),
foreign key(so_pn) references phieu_nhap(so_pn)
);

create table vat_tu_don_dh(
ma_vtu int,
so_dh int,
primary key(ma_vtu,so_dh),
foreign key(ma_vtu) references vat_tu(ma_vtu),
foreign key(so_dh) references don_dh(so_dh)
);






