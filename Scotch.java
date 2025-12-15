import java.util.Scanner;

public class Scotch implements Alcohol{
    
     int x;
    String name;

    Scanner sc = new Scanner(System.in);

    public Scotch(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("Do you really want Scotch?");
        System.out.println("Press y/Y for Yes or any other key for No");
        char choice = sc.next().charAt(0);

        if(choice=='y'||choice=='Y'){
            System.out.println("================================");
            System.out.println("You have selected Scotch");
            System.out.println(x+ " glass of Scotch for "+name);
        }
        
        else{
                System.out.println("No Scotch for you");
                return;
        }
        


        System.out.println("The price for your Scotch is Rs 600");
        System.out.println("Its color is Yellow");
        
    }

    @Override
    public void drink(){

        System.out.println("Enjoy your Scotch!");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }
}
