package Phase2;

public class ArrayTwoDim {
    public static void main(String[] args) {
        String[][] product = {
            {"table", "chair", "lamp"},
            {"keyboard", "mouse", "pad"},
            {"liptic", "rollon", "cream"}
        };
        // [row][column]
        System.out.println(product[2][1]);


        System.out.println("#############");

        // การเข้าถึงด้วย for loop
        for(int row = 0; row < product.length; row++){
            for(int column = 0; column < product[row].length; column++){
                System.out.println(product[row][column]);
            }
        }
    }
}
