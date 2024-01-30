package Projects.ait.controllers;

import java.util.List;
import java.util.Scanner;

import Projects.ait.model.User;
import Projects.ait.services.UserService;

public class UserControllerConsole implements UserController{

    Scanner scanner = new Scanner(System.in);
    
    private UserService service;

    public UserControllerConsole(UserService service){
        this.service = service;
    }
    public void create(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        try{
        service.createUser(name, email);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public User getById(){
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        return service.getById(Long.parseLong(id));
         
    }

    public User getByEmail(){
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        return service.getByEmail(email);
    }

    public List<User> getAll(){
       return service.getAllUsers();
    }

    public void printAll(){
        List<User> allUsers = service.getAllUsers();
        if(allUsers.isEmpty()){
            System.out.println("There are still no users or the data is not available");
        }else{
            allUsers.forEach(System.out::println);
        }
    }

    public void delete(){
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        service.deleteById(Long.parseLong(id));
    }

    public void update(){
        System.out.println("Enter id the user you want to update: ");
        String id = scanner.nextLine();

        System.out.println("Enter new name: ");
        String name = scanner.nextLine();

        System.out.println("Enter new email ");
        String email = scanner.nextLine();

        User tempUser = new User(Long.parseLong(id), name, email);

        try{
            service.updateUser(tempUser);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }


}
