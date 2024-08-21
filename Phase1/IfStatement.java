import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your age(int): ");
        int age = sc.nextInt();

        if(age <= 19){
            System.out.println("young");
        }else if(age >= 20){
            System.out.println("adult");
        }else{
            System.out.println("invalid input");
        }
    }
}
