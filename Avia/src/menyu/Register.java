package menyu;

import Entity.User;
import Util.Print;
import database.Database;

public class Register {
    private Print PrintUtil;
    public void userRegister() {
        String userName = PrintUtil.getText("Enter username");
        String name = PrintUtil.getText("Enter name");
        String surname = PrintUtil.getText("Enter surname");
        String password = PrintUtil.getText("Enter password");

        boolean registered = User.userRegister(new User(userName, name, surname, password));
        if (!registered) {
            System.out.println("register failed!");
        } else {
            System.out.println("Register successfuly");
            Database dataBase = Database.getInstance();
            dataBase.writeFileDatabase();
        }

    }
}