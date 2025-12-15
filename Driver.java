
import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine v1 = new VendingMachine();
        char choice;
        do { 
            v1.selectBeverage();
            System.out.println("Press y or Y to continue else Press any other key to stop");
            choice = sc.next().charAt(0);

        } while (choice=='y'||choice=='Y');

        System.out.println("Your purchase has ended");
        
    }


}
