package service;

import model.TComplex;

import java.util.List;

public interface ITComplexService {
    List<TComplex> findAll();
    TComplex findById(String Id);

    boolean createComplex(TComplex tComplex);

    boolean remove(String id);

    List<TComplex> search(String loaiVanPhong, String tang);
}
