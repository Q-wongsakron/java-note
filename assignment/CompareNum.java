package assignment;
import java.util.Scanner;
public class CompareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num1: ");
        int num1 = sc.nextInt();
        System.out.print("input num2: ");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("num1 equre num2");
        }else if(num1 > num2){
            System.out.println("num1 more than num2");
        }else if(num1< num2){
            System.out.println("num1 less than num2");
        }else{
            System.out.println("Invalid input");
        }
    }
}
