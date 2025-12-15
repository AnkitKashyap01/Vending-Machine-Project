import java.util.Scanner;

public class Wisci implements Alcohol {
    
     int x;
    String name;

    Scanner sc = new Scanner(System.in);

    public Wisci(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public void displayInfo(){

        System.out.println("Do you really want Wisci?");
        System.out.println("Press y/Y for Yes or press any other key for No");
        char choice = sc.next().charAt(0);

        if(choice=='y'||choice=='Y'){
            System.out.println("================================");
            System.out.println("You have selected Wisci");
            System.out.println(x+ " glass of Wisci for "+name);
        }
       
        else{
                System.out.println("No wisci for you");
                return;
        }
        

        System.out.println("The price for your Wisci is Rs 700");
        System.out.println("Its color is Transparent");
        
    }

    @Override
    public void drink(){

        System.out.println("Enjoy your Wisci!");
        System.out.println("Have a good day!");
        System.out.println("==================================");

    }
}
