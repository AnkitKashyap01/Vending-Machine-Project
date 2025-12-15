import java.util.Scanner;

public class Americano implements Coffee{

    int x;
    String name;
    Scanner sc = new Scanner(System.in);

    public Americano(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("How would you like Your Americano With or Without Sugar?");
        System.out.println("Press s/S for With Sugar or n/N for Without Sugar");
        char choice = sc.next().charAt(0);

        if(choice=='s'||choice=='S'){
            System.out.println("================================");
            System.out.println("You have selected Sugared Americano");
            System.out.println(x+ " Sugared Americano for "+name);
        }
        else if(choice=='n'||choice=='N'){
            System.out.println("================================");
            System.out.println("You have selected Without Sugar Americano");
            System.out.println(x+ " Without Sugar Americano for "+name);
        }

        else{
            displayInfo();
        }

        System.out.println("The price for your Americano is Rs 600");
        System.out.println("Its color is black");
        
    }

    @Override
    public void drink(){

        System.out.println("May this Americano relieve your stress!");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }
    

    
}
