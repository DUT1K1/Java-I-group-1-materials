package dao;

import entity.User;

public interface UserDao {
     User create(User user);
     boolean login(String email, String password);
}
