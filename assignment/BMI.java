package assignment;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        /*
           BMI = weight(kg)/ tall(meter)**2
        */

        Scanner sc = new Scanner(System.in);
        double bmi;

        System.out.print("Input your weight(kg): ");
        double weigth = sc.nextDouble();

        System.out.print("Input your tall(meter): ");
        double tall = sc.nextDouble();

        bmi = weigth / (tall*tall);

        System.out.println("Your bmi is: " + bmi);
        
        if(bmi <= 18){
            System.out.println("your bmi is below threshold");
        }else if(bmi >= 18.5 && bmi <= 22.9){
            System.out.println("your bmi is standard");
        }else if(bmi >= 23.0 && bmi <= 24.9){
            System.out.println("your bmi is over weight");
        }else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("your bmi is fat");
        }else{
            System.out.println("your bmi is over fat");
        }
    }
}
