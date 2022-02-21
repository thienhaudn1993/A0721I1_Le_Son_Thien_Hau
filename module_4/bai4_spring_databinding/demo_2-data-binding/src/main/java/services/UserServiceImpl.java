package services;

import models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService{
    private static List<User> userList;
    static {
        userList = new ArrayList<>();
        userList.add(new User(1, "TrungDP", "Da Nang", 30, "trung.doan@codegym.vn"));
        userList.add(new User(2, "TrungDC", "Quảng Nam", 25, "trung.dang@codegym.vn"));
        userList.add(new User(3, "TienNVT", "Da Nang", 25, "tien.nguyen@codegym.vn"));
        userList.add(new User(4, "HaiTT", "Quảng Nam", 23, "hai.truong@codegym.vn"));
        userList.add(new User(5, "ChanhTV", "Quy Nhơn", 31, "chanh.tran@codegym.vn"));
    }
    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public void saveUser(User user) {
        userList.add(user);
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void editUser(User user) {

    }
}
