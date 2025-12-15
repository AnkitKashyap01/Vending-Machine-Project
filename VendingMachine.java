
import java.util.Scanner;

public class VendingMachine {

    Scanner sc = new Scanner(System.in);

    public VendingMachine() {

        System.out.println("Please select your beverage");
    }
    
    public void selectBeverage() {

        System.out.println("Press 1 for Coffee");
        System.out.println("Press 2 for Soft Drinks");
        System.out.println("Press 3 for Alcohol");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("You have selected Coffee");

            Coffee c1 = selectCoffee();
            c1.displayInfo();
            c1.drink();
            
        }
        else if(choice == 2){
            System.out.println("You have selected Soft Drinks");

            SoftDrinks s1 = selectSoftDrinks();
            s1.displayInfo();
            s1.drink();
        }
        else if(choice == 3){
            System.out.println("You have selected Alcohol");

            Alcohol a1 = selectAlcohol();
            a1.displayInfo();
            a1.drink();
        }
        else{
            System.out.println("Invalid Selection");
        }
    }

    public Coffee selectCoffee(){
        System.out.println("Please Select your Coffee type");

        System.out.println("Press 1 for Latte");
        System.out.println("Press 2 for Espresso");
        System.out.println("Press 3 for Americano");

        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("You have Selected Latte");
            System.out.println("How many Latte do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Latte(x, name);
        }

        else if(choice==2){
            System.out.println("You have Selected Espresso");
            System.out.println("How many Espresso do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Espresso(x, name);

        }

        else if(choice==3){
            System.out.println("You have Selected Americano");
            System.out.println("How many Americano do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Americano(x, name);
        }
        else{
            System.out.println("You have selected invalid option, Please select a valid option.");
            return selectCoffee();
        }
    }

    public SoftDrinks selectSoftDrinks(){

        System.out.println("Please choose your Softy type.");
        System.out.println("Press 1 for Coke");
        System.out.println("Press 2 for Sprite");
        System.out.println("Press 3 for Fanta");

        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("You have Selected Coke");
            System.out.println("How many cans of Coke do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Coke(x, name);
        }
        else if(choice==2){
            System.out.println("You have Selected Sprite");
            System.out.println("How many cans of Sprite do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Sprite(x, name);
        }
        else if(choice==3){

            System.out.println("You have Selected Fanta");
            System.out.println("How many cans of Fanta do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Fanta(x, name);
        }
        else{
            System.out.println("You have selected invalid option, Please select a valid option.");
            return selectSoftDrinks();
        }
    }

    public Alcohol selectAlcohol(){

        System.out.println("Please choose your Alcohol type.");
        System.out.println("Press 1 for Wine");
        System.out.println("Press 2 for Scotch");
        System.out.println("Press 3 for Wisci");

        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("You have Selected Wine");
            System.out.println("How many glass of Wine do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Wine(x, name);
        }
        else if(choice==2){
            System.out.println("You have Selected Scotch");
            System.out.println("How many glass of Scotch do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Scotch(x, name);
        }
        else if(choice==3){

            System.out.println("You have Selected Wisci");
            System.out.println("How many glass of Wisci do you want?");
            int x = sc.nextInt();
          
            System.out.println("What's your name?");
            
            sc.nextLine();
            String name = sc.nextLine();

            return new Wisci(x, name);
        }
        else{
            System.out.println("You have selected invalid option, Please select a valid option.");
            return selectAlcohol();
        }
    }
}
