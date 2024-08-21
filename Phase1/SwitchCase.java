import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input num month: ");
        int month = sc.nextInt();
        String name = "";
        switch (month) {
            case 1 : 
                name = "Jan";
                break;
            case 2 : 
                name = "Feb";
                break;
            // ...
            default: 
                name = "Invalid Value";
        }
        System.out.println(month + " is "+ name);
    
    }
}
