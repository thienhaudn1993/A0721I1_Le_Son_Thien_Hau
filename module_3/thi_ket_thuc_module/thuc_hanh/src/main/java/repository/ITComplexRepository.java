package repository;

import model.TComplex;

import java.util.List;

public interface ITComplexRepository {
    List<TComplex> findAll();


    TComplex findById(String id);

    void createComplex(TComplex tComplex);

    void remove(String id);

    List<TComplex> search(String loaiVanPhong, String tang);
}
