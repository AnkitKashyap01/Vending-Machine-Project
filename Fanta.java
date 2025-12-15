import java.util.Scanner;

public class Fanta implements SoftDrinks {
    
    int x;
    String name;

    Scanner sc = new Scanner(System.in);

    public Fanta(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("Do you want Normal Fanta or Diet Fanta?");
        System.out.println("Press f/F for Normal Fanta or d/D for Diet Fanta");
        char choice = sc.next().charAt(0);

        if(choice=='f'||choice=='F'){
            System.out.println("================================");
            System.out.println("You have selected Normal Fanta");
            System.out.println(x+ " Fanta for "+name);
        }
        else if(choice=='d'||choice=='D'){
            System.out.println("================================");
            System.out.println("You have selected Diet Fanta");
            System.out.println(x+ " Diet Fanta for "+name);
        }

        else{
            System.out.println("Please Select a choice");
            displayInfo();
        }

        System.out.println("The price for your Fanta is Rs 50");
        System.out.println("Its color is Orange");
        
    }

    @Override
    public void drink(){

        System.out.println("Enjoy your Fanta");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }
}
