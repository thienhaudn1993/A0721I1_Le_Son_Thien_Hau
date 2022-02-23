package service.Impl;

import model.Dictionary;
import repository.ITranslateRepository;
import repository.Impl.TranslateRepository;
import service.ITranslateService;

import java.util.List;

public class TranslateServiceImpl implements ITranslateService {
    ITranslateRepository iTranslateRepository = new TranslateRepository();
    @Override
    public List<Dictionary> findAll() {
        return iTranslateRepository.findAll();
    }
}
