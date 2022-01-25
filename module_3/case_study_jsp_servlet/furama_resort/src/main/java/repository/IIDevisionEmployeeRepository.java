package repository;

import model.DevisionEmployee;

import java.util.List;

public interface IIDevisionEmployeeRepository {
    List<DevisionEmployee> findByAll();
}
