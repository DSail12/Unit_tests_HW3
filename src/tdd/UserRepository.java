package hw3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> data = new ArrayList<>();
    public void addUser(User user) {
        if (user != null && !findByName(user.getName())) {
            data.add(user);
        }
    }
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public void logoutAllUsers(User[] users) {
        if (users != null) {
            for (User user : users) {
                if (user != null && !user.isAdmin()) {
                    user.setAuthenticate(false);
                }
            }
        }
    }
}