package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GenericRepository<User> {

    private List<User> users = new ArrayList<>();
    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        List<User> allUsers = new ArrayList<>();
        for (User user : users) {
            allUsers.add(user);
        }
        return allUsers;
    }

    @Override
    public void save(User entity) {
        users.add(entity);
    }

    @Override
    public void update(Long id, User entity) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId().equals(id)) {
                users.set(i, entity);
                System.out.println("User with ID " + id + " updated successfully.");
                return;
            }
        }
        System.out.println("User with ID " + id + " not found.");

    }

    @Override
    public void delete(Long id) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId().equals(id)) {
                users.remove(i);
                System.out.println("User with ID " + id + " deleted successfully.");
                return;
            }
        }
        System.out.println("User with ID " + id + " not found.");
    }

}
