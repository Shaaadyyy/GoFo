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

public class Playground {
    String name;
    String location;
    int price, id;
    ArrayList<Playground> playgrounds = new ArrayList<>();
    ArrayList<Time> time = new ArrayList();

    public Playground(String name, int price, String location, ArrayList time,int id ) {
        this.name = name;
        this.price = price;
        this.time = time;
        this.id = id;
        this.location = location;
    }

    public Playground() {

    }
    public void addPlayground(Playground p){
        playgrounds.add(p);
    }
    public void removePlaygroundTime(Playground g,int i){
        g.time.remove(i);
    }

    public void DisplayPlaygrounds()
    {
        for (int i=1;i<=playgrounds.size();i++)
        {
            System.out.println("Playground number:" + (i));
            System.out.println("Playground name:" + playgrounds.get(i-1).getName());
            System.out.println("Playground ID:" + playgrounds.get(i-1).getId());
            System.out.println("Playground price:" + playgrounds.get(i-1).getPrice());
            System.out.println("Playground location:" + playgrounds.get(i-1).getLocation());
            System.out.println("Playground avaliable times:" + playgrounds.get(i-1).getTime().toString());
            System.out.println("");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public String getLocation()
    {
        return location;
    }

    public void addTime(ArrayList time, String newTime) {
        time.add(newTime);
    }
}
