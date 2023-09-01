package Services;

import Entity.User;
import dao.UserDAO;


public class UserService {
    private UserDAO userDAO = new UserDAO();

    public User getUser(String userName, String password) {
        return userDAO.getAll().stream().filter(u -> u.getUserName().equals(userName) && u.getPassword().equals(password)).findFirst().orElse(null);
    }

    public boolean userRegister(User user) {
        return userDAO.creat(user);
    }

}
