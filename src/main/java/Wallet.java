/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Wallet {
    int id,balance;

    public Wallet(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public Wallet() {

    }

    public void Transfer(Wallet w1,Wallet w2, int amount){
       int balance1 = w1.getBalance();
       int balance2 = w2.getBalance();
       if(balance1<amount){
           System.out.println("Insufficient funds");
       }else {
           balance1 = balance1 - amount;
           balance2 = balance2 + amount;
           w2.setBalance(balance2);
           w1.setBalance(balance1);
       }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
