package assignment;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your number(int): ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even");
        }else if(num % 2 == 1){
            System.out.println(num + " is Odd");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
