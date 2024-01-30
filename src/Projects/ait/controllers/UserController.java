package Projects.ait.controllers;

import java.util.List;

import Projects.ait.model.User;

public interface UserController {

    public void create();
    
    User getById();
    
    User getByEmail();

    public List<User> getAll();

    public void printAll();

    public void delete();

    public void update();
    
    
}
