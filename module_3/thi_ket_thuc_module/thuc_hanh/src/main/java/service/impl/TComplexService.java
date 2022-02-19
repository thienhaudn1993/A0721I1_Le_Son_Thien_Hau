package service.impl;

import model.TComplex;
import repository.ITComplexRepository;
import repository.impl.TComplexRepository;
import service.ITComplexService;

import java.util.List;

public class TComplexService implements ITComplexService {
    private ITComplexRepository itComplexRepository = new TComplexRepository();
    @Override
    public List<TComplex> findAll() {
        return itComplexRepository.findAll();
    }

    @Override
    public TComplex findById(String Id) {
        return itComplexRepository.findById(Id);
    }

    @Override
    public boolean createComplex(TComplex tComplex) {
        TComplex tComplex1 = findById(tComplex.getMa_mb());
        if (tComplex1 != null) {
            return false;
        }else {
            itComplexRepository.createComplex(tComplex);
            return true;
        }

    }

    @Override
    public boolean remove(String id) {
        TComplex tComplex1 = findById(id);
        if (tComplex1 == null) {
            return false;
        }else {
         itComplexRepository.remove(id);
         return true;
        }

    }

    @Override
    public List<TComplex> search(String loaiVanPhong, String tang) {
        return itComplexRepository.search(loaiVanPhong,tang);
    }
}
