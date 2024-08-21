class TypeCasting {
    public static void main(String[] args) {
        //แปลงจากเล็กไปใหญ่
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numDouble);

        //เเปลงจากใหญ่ไปเล็ก
        double numDouble2 = 10.0;
        int numInt2 = (int)numDouble2;
        System.out.println(numInt2);
        

        System.err.println("<---------------");

        String a = "100", b = "200";

        
        // string to Integer
        int c;
        c = Integer.parseInt(a);
        c = c + 50;

        // string to double
        double d = Double.parseDouble(a);
        d = d + 3.55;

        // int to string
        int num1 = 100;
        String age = String.valueOf(num1);


 

        a = a + 50; // มันจะเอา string มาต่อกัน เพราะ a เป็น string

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.err.println(d);
        System.err.println(age);

        System.err.println("<----------");
        
        // เช๋คชนิดข้อมูล  int ต้องเรียกใช้ Integer
        // instanceof ใช้ในการเช็ค ข้างหน้าที่เป็นชื่อคลาสเท่านั้น
        // Integer, double, String, boolean, char, float
        boolean result = a instanceof String;
        System.out.println(result);
    }
}