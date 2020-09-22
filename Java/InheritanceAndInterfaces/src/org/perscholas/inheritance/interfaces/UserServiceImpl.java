package org.perscholas.inheritance.interfaces;

import org.perscholas.inheritance.diamond.Human;

public class UserServiceImpl implements UserService {
    @Override
    public Human grabHuman() {
        Human human = new Human();
        return human;
    }
}
