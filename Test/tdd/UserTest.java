package hw3.Test.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;
    @Before
    public void setUp() {
        user = new User("John", "password123", false);
    }
    @Test
    public void testConstructor() {
        Assert.assertEquals("John", user.getName());
        Assert.assertEquals("password123", user.getPassword());
        Assert.assertFalse(user.isAdmin());
        Assert.assertTrue(user.isAuthenticate());
    }

    @Test
    public void testAuthenticate() {
        Assert.assertTrue(user.authenticate("John", "password123"));
        Assert.assertFalse(user.authenticate("John", "wrongPassword"));
        Assert.assertFalse(user.authenticate("Jane", "password123"));
    }

    @Test
    public void testSetName() {
        user.setName("Jane");
        Assert.assertEquals("Jane", user.getName());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("newPassword");
        Assert.assertEquals("newPassword", user.getPassword());
    }

    @Test
    public void testIsAuthenticate() {
        Assert.assertTrue(user.isAuthenticate());
        user.setAuthenticate(false);
        Assert.assertFalse(user.isAuthenticate());
    }
}