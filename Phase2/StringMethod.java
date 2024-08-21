package Phase2;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Hello";
        String city = new String("Rayong"); // Object
        
        String name1 = "Hello";
        String name2 = "hello";
        // Concatenation ต่อ string
        System.out.println(name + city);
        System.out.println(name.concat(city));

        // หาความยาว String
        System.out.println(name.length());

        // หาตำเเหน่งตัว อักษร charAt index นั้นเป็นตัวอักษรอะไร
        System.out.println(city.charAt(2)); // ตัว y

        // เปรียบเทียบ String 
        // equals คิดเคส พิมเล็กพิมใหญ่
        boolean result = name1.equals(name2);
        System.out.println(result);
        // equalsIgnoreCase
        System.out.println(name1.equalsIgnoreCase(name2));

        // หาตัวหน้าสุด หรือท้ายสุด ว่ามีตัวนี้ไหม คืนค่าเป็น boolean
        String fullname = "Wongsakron";
        String code = "77721381239TH";
        System.out.println(fullname.startsWith("Wong"));
        if(code.endsWith("TH")){
            System.out.println("From TH");
        }
    
        // ค้นหาคำที่ต้องการ return เป็น index ไม่เจอ -1
        System.out.println(code.indexOf("TH"));
    }
}
