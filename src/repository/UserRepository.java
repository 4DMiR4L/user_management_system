package repository;

import model.User;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class UserRepository implements GenericRepository<User> {
    private List<User> users = new ArrayList<>();


    @Override
    public Optional<User> findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {

    }

    @Override
    public void save(User entity) {

    }

    @Override
    public void update(Long id, User entity) {

    }

    @Override
    public void delete(Long id) {

    }

}
