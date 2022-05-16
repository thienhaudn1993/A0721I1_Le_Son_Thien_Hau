export interface Service {
  id: number;
  tenDichVu: string;
  dienTich: number;
  loaiDichVu: string;
  chiPhiThue: number;
  soLuongNguoiToiDa: number;
  kieuThue: string;
  // phan rieng tung ten dich vu
  tieuChuanPhong?: string;
  moTaTienNghiKhac?: string;
  dienTichHoBoi?: string;
  soTang?: number;
  dichVuMienPhiKemTheo?: string;
  // dichVuDiKem?: string;
  tenDichVuDiKem?: string;
  donVi?: string;
  giaTien?: number;
  src?: string;
}
