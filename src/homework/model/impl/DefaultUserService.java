package homework.model.impl;

import homework.model.Persister;
import homework.model.User;
import homework.model.UserService;

public class DefaultUserService implements UserService {
    private final User user;
    private final Persister persister;

    public DefaultUserService(User user, Persister persister) {
        this.user = user;
        this.persister = persister;
    }

    public void save() {
        persister.save(user);
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
