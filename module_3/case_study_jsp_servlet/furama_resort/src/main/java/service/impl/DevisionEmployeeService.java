package service.impl;

import model.DevisionEmployee;
import repository.IIDevisionEmployeeRepository;
import repository.impl.DevisionEmployeeRepository;
import service.IDevisionEmployeeService;

import java.util.List;

public class DevisionEmployeeService implements IDevisionEmployeeService {
    IIDevisionEmployeeRepository iiDevisionEmployeeRepository = new DevisionEmployeeRepository();
    @Override
    public List<DevisionEmployee> findByAll() {
        return iiDevisionEmployeeRepository.findByAll();
    }
}
