package repository.impl;

import model.DevisionEmployee;
import repository.IIDevisionEmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DevisionEmployeeRepository implements IIDevisionEmployeeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<DevisionEmployee> findByAll() {
        List<DevisionEmployee> devisionEmployeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from division");
            ResultSet resultSet = preparedStatement.executeQuery();
            DevisionEmployee devisionEmployee;
            while (resultSet.next()) {
                devisionEmployee = new DevisionEmployee();
                devisionEmployee.setDevision_id(resultSet.getInt("division_id"));
                devisionEmployee.setDevision_name(resultSet.getString("division_name"));
                devisionEmployeeList.add(devisionEmployee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return devisionEmployeeList;
    }
}
