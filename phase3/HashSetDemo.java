package phase3;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("apple");
        data.add("pine apple");
        data.add("banana");
        System.out.println(data); // ไม่เรียงลำดับสมาชิก

        LinkedHashSet<String> data2 = new LinkedHashSet<>();
        data2.add("apple");
        data2.add("pine apple");
        data2.add("banana");
        System.out.println(data2); // เรียงลำดับการเพิ่ม
    
        TreeSet<String> data3 = new TreeSet<>();
        data3.add("apple");
        data3.add("pine apple");
        data3.add("banana");
        System.out.println(data3); // เรียงตามตัวอักษร
    }
    
}
