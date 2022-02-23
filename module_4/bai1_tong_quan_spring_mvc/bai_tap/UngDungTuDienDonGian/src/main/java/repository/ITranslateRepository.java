package repository;

import model.Dictionary;

import java.util.List;

public interface ITranslateRepository {
    List<Dictionary> findAll();
}
