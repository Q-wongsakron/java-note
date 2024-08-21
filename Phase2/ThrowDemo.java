package Phase2;
import java.util.Scanner;
public class ThrowDemo {
    static int balance = 5000;
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input number withdraw: ");
            int money = sc.nextInt();

            widthDraw(money);
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // throws Exception ประกาศว่า method นี้มีการ โยน throw exception ใน method
    public static void widthDraw(int amount) throws Exception{
        //จำนวนเงินที่ถอน
        if(amount <= 0) 
        {
            throw new Exception("Input widthdraw more than 0");
        }
        if(amount > balance){
            throw new Exception("Your balance not enough");
        }
        balance -= amount;

        System.out.println("widthDraw: " + amount);
        System.out.println("balance: " + balance);

    }
}
