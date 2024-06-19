package homework.model.impl;

import homework.model.Persister;
import homework.model.User;

public class UserPersister implements Persister {
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}