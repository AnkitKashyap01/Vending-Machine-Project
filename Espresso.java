
import java.util.Scanner;

public class Espresso implements Coffee{
    
    int x;
    String name;

    Scanner sc = new Scanner(System.in);

    public Espresso(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("How would you like Your Espresso With or Without Sugar?");
        System.out.println("Press s/S for With Sugar or n/N for Without Sugar");
        char choice = sc.next().charAt(0);

        if(choice=='s'||choice=='S'){
            System.out.println("================================");
            System.out.println("You have selected Sugared Espresso");
            System.out.println(x+ " Sugared Espresso for "+name);
        }
        else if(choice=='n'||choice=='N'){
            System.out.println("================================");
            System.out.println("You have selected Without Sugar Espresso");
            System.out.println(x+ " Without Sugar Espresso for "+name);
        }

        else{
            displayInfo();
        }

        System.out.println("The price for your Espresso is Rs 700");
        System.out.println("Its color is black");
        
    }

    @Override
     public void drink(){

        System.out.println("May this Espresso relieve your stress!");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }
}
