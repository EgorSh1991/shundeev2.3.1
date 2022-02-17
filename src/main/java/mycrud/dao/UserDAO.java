package mycrud.dao;

import mycrud.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    void saveUser(User user);

    void delete(long id);

    User getIdUser(long id);

    User updateUser(User user);

}
