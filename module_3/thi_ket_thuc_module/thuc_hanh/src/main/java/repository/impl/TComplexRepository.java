package repository.impl;

import model.TComplex;
import repository.ITComplexRepository;
import sun.jvm.hotspot.asm.sparc.SPARCRegister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TComplexRepository implements ITComplexRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<TComplex> findAll() {
        List<TComplex> tComplexList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from tcomplex order by dien_tich");
            ResultSet resultSet = preparedStatement.executeQuery();
            TComplex tComplex;
            while (resultSet.next()) {
                tComplex = new TComplex();
                tComplex.setMa_mb(resultSet.getString("ma_db"));
                tComplex.setDien_tich(resultSet.getDouble("dien_tich"));
                tComplex.setTrang_thai(resultSet.getString("trang_thai"));
                tComplex.setTang(resultSet.getInt("tang"));
                tComplex.setLoai_van_phong(resultSet.getString("loai_van_phong"));
                tComplex.setGia_cho_thue(resultSet.getDouble("gia_cho_thue"));
                tComplex.setNgay_bat_dau(resultSet.getString("ngay_bat_dau"));
                tComplex.setNgay_ket_thuc(resultSet.getString("ngay_ket_thuc"));
                tComplexList.add(tComplex);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tComplexList;
    }

    @Override
    public TComplex findById(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from tcomplex where ma_db=?");
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            TComplex tComplex = null;
            while (resultSet.next()) {
                tComplex = new TComplex();
                tComplex.setMa_mb(resultSet.getString("ma_db"));
                tComplex.setDien_tich(resultSet.getDouble("dien_tich"));
                tComplex.setTrang_thai(resultSet.getString("trang_thai"));
                tComplex.setTang(resultSet.getInt("tang"));
                tComplex.setLoai_van_phong(resultSet.getString("loai_van_phong"));
                tComplex.setGia_cho_thue(resultSet.getDouble("gia_cho_thue"));
                tComplex.setNgay_bat_dau(resultSet.getString("ngay_bat_dau"));
                tComplex.setNgay_ket_thuc(resultSet.getString("ngay_ket_thuc"));
                break;
            }
            return tComplex;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createComplex(TComplex tComplex) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into tcomplex (ma_db,dien_tich,trang_thai,tang,loai_van_phong,gia_cho_thue,ngay_bat_dau,ngay_ket_thuc) values (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,tComplex.getMa_mb());
            preparedStatement.setDouble(2,tComplex.getDien_tich());
            preparedStatement.setString(3,tComplex.getTrang_thai());
            preparedStatement.setInt(4,tComplex.getTang());
            preparedStatement.setString(5,tComplex.getLoai_van_phong());
            preparedStatement.setDouble(6,tComplex.getGia_cho_thue());
            preparedStatement.setString(7,tComplex.getNgay_bat_dau());
            preparedStatement.setString(8,tComplex.getNgay_ket_thuc());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from tcomplex where ma_db = ? ");
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TComplex> search(String loaiVanPhong, String tang) {
        List<TComplex> tComplexList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from tcomplex where loai_van_phong=? and tang =?");
            String loaiVanPhong1 = "%"+loaiVanPhong+"%";
            String tang1 = "%"+tang+"%";
            preparedStatement.setString(1,loaiVanPhong1);
            preparedStatement.setString(2,tang1);
            ResultSet resultSet = preparedStatement.executeQuery();
            TComplex tComplex;
            while (resultSet.next()) {
                tComplex = new TComplex();
                tComplex.setMa_mb(resultSet.getString("ma_db"));
                tComplex.setDien_tich(resultSet.getDouble("dien_tich"));
                tComplex.setTrang_thai(resultSet.getString("trang_thai"));
                tComplex.setTang(resultSet.getInt("tang"));
                tComplex.setLoai_van_phong(resultSet.getString("loai_van_phong"));
                tComplex.setGia_cho_thue(resultSet.getDouble("gia_cho_thue"));
                tComplex.setNgay_bat_dau(resultSet.getString("ngay_bat_dau"));
                tComplex.setNgay_ket_thuc(resultSet.getString("ngay_ket_thuc"));
                tComplexList.add(tComplex);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tComplexList;
    }
}
