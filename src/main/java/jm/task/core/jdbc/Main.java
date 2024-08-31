package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 33);
        userService.saveUser("Пётр", "Петров", (byte) 32);
        userService.saveUser("Алексей", "Алексеев", (byte) 31);
        userService.saveUser("Сергей", "Сергеев", (byte) 30);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();

        userService.removeUserById(2);
    }
}
