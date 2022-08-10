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

public class Owner extends User{
    Wallet userWallet;

    public Owner(String name, String password, String location, String email, String phone, int id, Wallet userWallet) {
        super(name, password, location, email, phone, id);
        this.userWallet = userWallet;
    }

    public Wallet getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(Wallet userWallet) {
        this.userWallet = userWallet;
    }

    public Owner(){


    }
    public void CreatePlayground(String newName, int newPrice, String location, ArrayList newTime, int newId ){
        Playground p1 = new Playground(newName, newPrice, location, newTime, newId);

    }

}
