
import java.util.Scanner;

public class Coke implements SoftDrinks {
    
    int x;
    String name;

    Scanner sc = new Scanner(System.in);

    public Coke(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("Do you want Normal Coke or Diet Coke?");
        System.out.println("Press c/C for Normal Coke or d/D for Diet Coke");
        char choice = sc.next().charAt(0);

        if(choice=='c'||choice=='C'){
            System.out.println("================================");
            System.out.println("You have selected Normal Coke");
            System.out.println(x+ " Coke for "+name);
        }
        else if(choice=='d'||choice=='D'){
            System.out.println("================================");
            System.out.println("You have selected Diet Coke");
            System.out.println(x+ " Diet Coke for "+name);
        }

        else{
            System.out.println("Please Select a choice");
            displayInfo();
        }

        System.out.println("The price for your Coke is Rs 50");
        System.out.println("Its color is black");
        
    }

    @Override
    public void drink(){

        System.out.println("Enjoy your Coke");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }


}
