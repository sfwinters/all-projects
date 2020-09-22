package org.perscholas.inheritance.interfaces;
import org.perscholas.inheritance.diamond.Human;

public interface UserService {
    //I want a method that returns a Human object
    public Human grabHuman(); //interfaces do not allow you to use curly braces to add new methods.
}
