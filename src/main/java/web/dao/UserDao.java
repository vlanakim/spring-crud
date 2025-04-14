package web.dao;

import model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
}
