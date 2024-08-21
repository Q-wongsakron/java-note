package Phase2;

public class CharacterMethod {
    public static void main(String[] args) {
        // char alphabet = 'A';
        // char [] group = {'A', 'B','C', 'D'};

        // เเบบ class
        char c = 'b';
        Character alphabet = new Character('A');
        System.out.println(Character.isLetter(alphabet)); // เช็คว่าเป็นตัวอักษรหรือไม่
        System.out.println(Character.isDigit(alphabet)); // เช็คว่าเป็นตัวเลขหรือไม่

        System.out.println(Character.isUpperCase(c)); // เช็คว่าเป็นอัพเปอร์หรือไม่
        System.out.println(Character.isLowerCase(alphabet));

        // เปลี่ยน c เป็น พิมพ์ใหญ่
        System.out.println("After: "+ Character.toUpperCase(c));
    }
}
