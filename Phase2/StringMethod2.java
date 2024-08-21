package Phase2;

public class StringMethod2 {
    public static void main(String[] args) {
        // Replace
        String message = "Happy New Year 2022 | Happy Birth Day 2022";
        message = message.replace("2022", "2023");
        System.out.println(message);
    
        // String => Array "split(symbol)"
        String data = "mango,durian,lemon";

        String [] fruit = data.split(",");

        for(String item: fruit){
            System.out.println(item);
        }

        // หาข้อความย่อย substring(จุดเริ่มต้น, จุดสุดท้าย - 1)
        String name = "Wongsakron";
        System.out.println(name.substring(0,4));

        // เเปลง String เป็น Character
        char [] alphabet = name.toCharArray();
        System.out.println(alphabet[0]);
        // เเปลง Character เป็น String
        char [] name2 = {'w','o','n','g'};
        String result = String.copyValueOf(name2);
        System.out.println(result);

        // ตัดช่องว่างใน String .trim();
        String message2 = "        Hello World        ";
        System.out.println(message2.trim());

        // เเปลงตัวพิมพ์ใหญ่-เล็ก  .toUpperCase .toLowerCase
        String surename = "hello world";
        System.out.println(surename.toUpperCase());

        // เเปลง int เป็น String
        int number = 100;
        String strNumber = String.valueOf(number);
        System.out.println(strNumber);
    }
}
