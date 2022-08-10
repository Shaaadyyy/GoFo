/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.*;


public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Wallet player1Wallet = new Wallet(5,1000);
        Wallet owner1Wallet = new Wallet(25,500);
        Wallet owner2Wallet = new Wallet(25,700);
        ArrayList<Time> playgroundTimes = new ArrayList();
        Time t12 = new Time("12 pm");
        Time t2 = new Time("2 pm");
        Time t5 = new Time("5 pm");
        Time t9 = new Time("9 am");
        Time t3 = new Time("3 pm");
        Time t6 = new Time("6 pm");

        playgroundTimes.add(t9);
        playgroundTimes.add(t12);
        playgroundTimes.add(t2);
        playgroundTimes.add(t3);
        playgroundTimes.add(t5);
        playgroundTimes.add(t6);
        User admin = new User();

        Playground playground1 = new Playground("Club",250,"El-Maadi",playgroundTimes,25);
        Playground playground2 = new Playground("Nadi",100,"Helwan",playgroundTimes,20);
        Owner owner1 = new Owner("mohamed","222","zahraa","mohamed@yahoo.com","011",25,owner1Wallet);
        Owner owner2 = new Owner("Hanafi","432","cairo","hanafi@yahoo.com","010",25,owner2Wallet);
        Player player1 = new Player("ahmed","123","maadi","ahmed@yahoo.com","011",5,player1Wallet);
        Playground allPlaygrounds = new Playground();
        allPlaygrounds.addPlayground(playground1);
        allPlaygrounds.addPlayground(playground2);
        admin.addUser(player1);
        admin.addUser(owner1);
        admin.addUser(owner2);
        Display(admin, allPlaygrounds,playgroundTimes);
    }

    public static void Display(User u,Playground allPlaygrounds, ArrayList time) {
        System.out.println("-----------------------------------");
        System.out.println("Welcome to the main menu");
        System.out.println("Please enter 1 to register an account");
        System.out.println("Enter 2 to exit the application");
        System.out.println("-----------------------------------");
        int choice1 = input.nextInt();
        do{
        switch (choice1) {
            case 1:
                System.out.println("What type of account would you like? 1 for player 2 for owner");
                int choice2 = input.nextInt();
                if (choice2 == 1) {
                    Player p = new Player();
                    Wallet playerWallet = new Wallet();
                    playerWallet.setId(1);
                    playerWallet.setBalance(1000);
                    p.setId(1);
                    System.out.println("Please enter your name");
                    input.nextLine();
                    String value = input.nextLine();
                    p.setName(value);
                    System.out.println("Please enter your Password");
                    value = input.nextLine();
                    p.setPassword(value);
                    System.out.println("Please enter your location");
                    value = input.nextLine();
                    p.setLocation(value);
                    System.out.println("Please enter your phone");
                    value = input.nextLine();
                    p.setPhone(value);
                    System.out.println("Enter your email");
                    value = input.nextLine();
                    p.setEmail(value);
                    u.addUser(p);
                    System.out.println("Do you want to book a playground ? 1 for yes , 2 for no");
                    int choice4 = input.nextInt();
                    if(choice4 == 1)
                    {
                        allPlaygrounds.DisplayPlaygrounds();
                        System.out.println("");
                        System.out.println("Please enter the playground number you would like to book");
                        int rakam = input.nextInt();
                        //if(rakam==1){
                        System.out.println("");
                        System.out.println("Please choose the number of the time you would like to book (from 1 to 5 in ascending order)");
                        rakam = input.nextInt();
                        time.remove(rakam-1);
                        System.out.println("Booking has been successfully done");
                    }
                    break;
                } else {
                    Owner o = new Owner();
                    System.out.println("Please enter your name");
                    input.nextLine();
                    String value2 = input.nextLine();
                    o.setName(value2);
                    System.out.println("Please enter your Password");
                    value2 = input.nextLine();
                    o.setPassword(value2);
                    System.out.println("Please enter your location");
                    value2 = input.nextLine();
                    o.setLocation(value2);
                    System.out.println("Please enter your phone");
                    value2 = input.nextLine();
                    o.setPhone(value2);
                    System.out.println("Enter your email");
                    value2 = input.nextLine();
                    o.setEmail(value2);
                    u.addUser(o);
                    System.out.println("Do you want to add a playground ? 1 for yes , 2 for no");
                    int choice5 = input.nextInt();
                    if(choice5 == 1)
                    {
                        Playground P = new Playground();
                        System.out.println("Please choose the playground's name");
                        String value1 = input.nextLine();
                        P.setName(value1);
                        System.out.println("Please choose the price of the playground");
                        int num = input.nextInt();
                        P.setPrice(num);
                        System.out.println("Please enter your owner ID");
                        num = input.nextInt();
                        allPlaygrounds.addPlayground(P);
                        System.out.println("Your playground has been successfully added");
                    }
                    else
                        break;
                    break;


                }

            case 2:
                break;
                }
                
            System.out.println("-----------------------------------");
            System.out.println("Welcome to the main menu");
            System.out.println("Please enter 1 to register an account");
            System.out.println("Enter 2 to exit the application");
            System.out.println("-----------------------------------");
        choice1 = input.nextInt();
    }
        while(choice1 != 2);
    }
}