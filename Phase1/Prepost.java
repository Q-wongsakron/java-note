public class Prepost {
    public static void main(String[] args) {
        /*
          ++a เพิ่มค่าให้ a ก่อนนำไปใช้
          a++ นำ a ไปใช้ก่อนเเล้วเพิ่มค่า
          b-- ลดค่าให้ b ก่อนนำไปใช้
          --b นำ b ไปใช้ก่อนเเล้วลดค่า
         */
        int a = 5;

        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        
        System.out.println();
        a = 5;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
    }
}
