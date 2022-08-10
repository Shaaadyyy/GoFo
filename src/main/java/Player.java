/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Player extends User {
    Wallet playerWallet;

    public Player(String name, String password, String location, String email, String phone, int id, Wallet playerWallet) {
        super(name, password, location, email, phone, id);
        this.playerWallet = playerWallet;
    }

    public Wallet getPlayerWallet() {
        return playerWallet;
    }

    public void setPlayerWallet(Wallet playerWallet) {
        this.playerWallet = playerWallet;
    }

    public Player(){

    }
}