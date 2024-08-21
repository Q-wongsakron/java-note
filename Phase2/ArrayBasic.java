package Phase2;

public class ArrayBasic {
    public static void main(String[] args) {
        
        int[] arr = new int[4];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        // ถ้าเกินจะเกิน array out of bound
        System.out.println("last position " + arr[3]);

        // เเบบกำหนดค่าเลย
        int[] arr2 = {10,20,30,40};
        System.out.println(arr2[2]);

        //การเปลี่ยนค่า
        arr2[2] = 100;
        System.out.println(arr2[2]);

        // การนับสมาชิกใน array
        System.out.println(arr2.length);

        System.out.println("###################");

        // การเข้าถึงสมาชิกด้วย for loop
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


        System.out.println("###################");
        String[] fruits = {"mango", "banana", "melon", "peach"};
        // การเข้าถึงสมาชิกด้วย for each
        for(int item: arr){
            System.out.println(item);
        }
        for(String item: fruits){
            System.out.println(item);
        }
    }
    
}
