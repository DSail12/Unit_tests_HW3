package hw3.Test.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryTest {
    private UserRepository userRepository;
    private List<User> data;

    @BeforeEach
    public void setUp() {
        userRepository = new UserRepository();
        data = new ArrayList<>();
    }

    @Test
    public void testAddUser_AddsUserToList() {
        User user = new User("username", "password", false);
        userRepository.addUser(user);

        data = userRepository.data;
        Assertions.assertEquals(1, data.size());
        Assertions.assertTrue(data.contains(user));
    }

    @Test
    public void testFindByName_ReturnsTrue_WhenUserExists() {
        User user = new User("username", "password", false);
        userRepository.addUser(user);

        boolean result = userRepository.findByName("username");
        Assertions.assertTrue(result);
    }
    @Test
    public void testFindByName_ReturnsFalseUserNotExists() {
        User user = new User("username", "password", false);
        userRepository.addUser(user);

        boolean result = userRepository.findByName("username2");
        Assertions.assertFalse(result);
    }

    @Test
    public void testFindByName_ReturnsFalse_WhenUserDoesNotExist() {
        boolean result = userRepository.findByName("username");
        Assertions.assertFalse(result);
    }
    @Test
    public void testLogoutAllUsers() {
        User adminUser = new User("Admin", "adminpassword", true);
        User user1 = new User("John", "password", false);
        User user2 = new User("Alice", "password", false);

        // Add the users to the repository
        userRepository.addUser(adminUser);
        userRepository.addUser(user1);
        userRepository.addUser(user2);

        // Create an array of users
        User[] users = new User[]{adminUser, user1, user2};

        // Вызов logoutAllUsers
        userRepository.logoutAllUsers(users);

        // Check the authentication status of each user
        Assertions.assertTrue(adminUser.isAuthenticate());
        Assertions.assertFalse(user1.isAuthenticate());
        Assertions.assertFalse(user2.isAuthenticate());

        // Additional assertions
        Assertions.assertTrue(adminUser.isAdmin());
        Assertions.assertFalse(user1.isAdmin());
        Assertions.assertFalse(user2.isAdmin());
    }
}