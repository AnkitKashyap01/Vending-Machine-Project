
import java.util.Scanner;

public class Latte implements  Coffee{

    int x;
    String name;
    Scanner sc = new Scanner(System.in);

    public Latte(int x, String name) {

        this.x = x;
        this.name = name;
    }   
    
   @Override
    public void displayInfo(){

        System.out.println("How would you like Your Latte With or Without Sugar?");
        System.out.println("Press s/S for With Sugar or n/N for Without Sugar");
        char choice = sc.next().charAt(0);

        if(choice=='s'||choice=='S'){
            System.out.println("================================");
            System.out.println("You have selected Sugared Latte");
            System.out.println(x+ " Sugared Latte for "+name);
        }
        else if(choice=='n'||choice=='N'){
            System.out.println("================================");
            System.out.println("You have selected Without Sugar Latte");
            System.out.println(x+ " Without Sugar Latte for "+name);
        }

        else{
            System.out.println("Please Select a choice");
            displayInfo();
        }

        System.out.println("The price for your Latte is Rs 500");
        System.out.println("Its color is black");
        
    }

    @Override
     public void drink(){

        System.out.println("May this Latte relieve your stress!");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }
    

}
