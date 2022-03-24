package com.codegym.managercustomer.service;



import com.codegym.managercustomer.model.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();
    void saveProvince(Province province);
    void deleteProvince(Long id);
    Province findProvinceById(Long id);
}
