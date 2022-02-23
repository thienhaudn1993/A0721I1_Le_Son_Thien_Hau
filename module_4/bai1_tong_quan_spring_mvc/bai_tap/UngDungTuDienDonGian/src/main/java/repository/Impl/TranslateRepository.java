package repository.Impl;

import model.Dictionary;
import repository.ITranslateRepository;

import java.util.*;

public class TranslateRepository implements ITranslateRepository {
    private static Map<Integer, model.Dictionary> dictionaryMap;
    static {
        dictionaryMap = new HashMap<>();
        dictionaryMap.put(1, new model.Dictionary("Xin Chào","hello"));
        dictionaryMap.put(2, new model.Dictionary("Thứ hai","monday"));
        dictionaryMap.put(3, new model.Dictionary("Tạm biệt","bye"));
    }
    @Override
    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
