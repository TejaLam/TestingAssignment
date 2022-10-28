import java.io.IOException;
import java.util.Scanner;

/**
 * Title : Urinals Testing
 * @author Teja Lam
 */
public class urinals {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("click 1 for Keyboard input");
        System.out.println("click 2 for giving file input");
        int choice = scan.nextInt();
        String str = "";
        Implementation implementation = new Implementation();
        if (choice == 1) {
            System.out.println("Enter the value to insert");

            str = scan.next();
            int urinalCount = implementation.countUrinals(str);
            if (urinalCount == -1)
                System.out.println("the mentioned String is Invalid");
            else
                System.out.println(urinalCount);
        } else if (choice == 2) {
            implementation.openFile("src/urinal.dat");
        } else {
            System.out.println("give only 1 || 2");
        }
    }
}
