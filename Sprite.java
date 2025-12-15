import java.util.Scanner;

public class Sprite implements SoftDrinks {
    
    int x;
    String name;

    Scanner sc = new Scanner(System.in);

    public Sprite(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("Do you want Normal Sprite or Diet Sprite?");
        System.out.println("Press s/S for Normal Sprite or d/D for Diet Sprite");
        char choice = sc.next().charAt(0);

        if(choice=='s'||choice=='S'){
            System.out.println("================================");
            System.out.println("You have selected Normal Sprite");
            System.out.println(x+ " Sprite for "+name);
        }
        else if(choice=='d'||choice=='D'){
            System.out.println("================================");
            System.out.println("You have selected Diet Sprite");
            System.out.println(x+ " Diet Sprite for "+name);
        }

        else{
            System.out.println("Please Select a choice");
            displayInfo();
        }

        System.out.println("The price for your Sprite is Rs 50");
        System.out.println("Its color is transparent");
        
    }

    @Override
    public void drink(){

        System.out.println("Enjoy your Sprite");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }
}
