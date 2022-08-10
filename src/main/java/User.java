/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.ArrayList;

public class User {
    String name,password,location,email,phone;
    int id;
    ArrayList<User> users = new ArrayList<User>();
    public User(String name, String password, String location, String email, String phone, int id) {
        this.name = name;
        this.password = password;
        this.location = location;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }
    public User(){

    }
    public void addUser(User u){
        users.add(u);
    }

    public void DisplayUsers()
    {
        for (int i=1;i<=users.size();i++)
        {
            System.out.println("Client number:" + (i));
            System.out.println("His name:" + users.get(i-1).getName());
            System.out.println("His ID:" + users.get(i-1).getId());
            System.out.println("His location:" + users.get(i-1).getLocation());
            System.out.println("His phone:" + users.get(i-1).getPhone());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
