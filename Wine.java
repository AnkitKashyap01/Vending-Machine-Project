import java.util.Scanner;

public class Wine implements Alcohol {
    
    int x;
    String name;

    Scanner sc = new Scanner(System.in);

    public Wine(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("Do you really want Wine?");
        System.out.println("Press y/Y for Yes or press any other key for No");
        char choice = sc.next().charAt(0);

        if(choice=='y'||choice=='Y'){
            System.out.println("================================");
            System.out.println("You have selected Wine");
            System.out.println(x+ " glass of Wine for "+name);
        }
        
        else{
            System.out.println("No wine for you");
            return;
        }
    

        System.out.println("The price for your Wine is Rs 500");
        System.out.println("Its color is Red");
        
    }

    @Override
    public void drink(){

        System.out.println("Enjoy your Wine!");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }

}
