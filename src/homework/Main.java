package homework;

import homework.model.Persister;
import homework.model.User;
import homework.model.UserService;
import homework.model.impl.DefaultUserService;
import homework.model.impl.UserPersister;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Persister persister = new UserPersister();
        UserService userService = new DefaultUserService(user, persister);
        
        userService.report();
        userService.save();
    }
}