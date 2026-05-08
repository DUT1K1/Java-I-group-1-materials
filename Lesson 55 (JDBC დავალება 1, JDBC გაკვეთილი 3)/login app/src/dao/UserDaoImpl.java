package dao;

import config.DCM;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    private final String CREATE =
            "INSERT INTO users (email, password, first_name, last_name) VALUES (?, ?, ?, ?) RETURNING id";

    @Override
    public User create(User user) {
        try (Connection con = DCM.getConnection()) {
            PreparedStatement ps = con.prepareStatement(CREATE);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(
                        rs.getInt("id"),
                        user.getEmail(),
                        user.getPassword(),
                        user.getFirstName(),
                        user.getLastName()
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean login(String email, String password) {
        return false;
    }
}
