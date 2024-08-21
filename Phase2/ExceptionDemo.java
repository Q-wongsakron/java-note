package Phase2;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {


        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);

            int [] arr = {10,20,30,40};
            System.out.println(arr[100]);
        }catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("donot divide with 0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is inValid");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("disconnect server");
        }

    }
}
