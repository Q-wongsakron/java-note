package phase3;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("TH", "Thailand");
        countries.put("JP", "Japan");
        countries.put("CN", "China");


        //countries.remove("CN");

        System.out.println(countries);
        System.out.println(countries.get("TH"));
        System.out.println(countries.containsKey("CN"));
        System.out.println(countries.containsValue("China"));
    }
}
