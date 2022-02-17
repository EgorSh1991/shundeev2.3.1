package mycrud.service;

import mycrud.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void saveUser(User user);

    void delete(long id);

    User getIdUser(long id);

    User updateUser(User user);
}
