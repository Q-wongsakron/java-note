import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        // รับค่าข้อมูล
        // ข้อมูลเเบบไหน ? ตัวเลข integer, float, long, double, ข้อความ string
        // ข้อความอะไร
        // ข้อความเเบบตัวเลข => คำนวณได้ | คำนวณไม่ได้
        
        // ประกาศใช้งาน class | new (การสร้าง object)
        Scanner sc = new Scanner(System.in);
        System.out.print("input your name = ");
        //next() ไม่อ่านช่องว่างในข้อความ hello world ไม่อ่าน world
        String name = sc.nextLine(); // รับ input via keyboard
        
        System.out.print("input year birdth = ");
        int year = sc.nextInt();



        System.out.println("your name is = "+ name);
        System.out.println("your birdth year is = " + year);
    
    }
}
