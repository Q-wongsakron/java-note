package Phase2;

public class MethodArray {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50};
        int [] numberB = {20,30,40,50};
        displayArray(numberA);

        int maxValue = findMaxInArray(numberA);

        int maxIndex = findMaxIndex(numberA);

        boolean compareArr = compareArray(numberA, numberB);

        int [] newArr = copyArray(numberB);

        System.out.println("Max Value in Array is: " + maxValue);
        System.out.println("Max Value Index is: " + maxIndex);
        System.out.println("Compare two array is equre: " + compareArr);
        displayArray(newArr);
    }
    // เมธอดรับค่า Array
    static void displayArray(int [] arr){
        for(int i = 0 ; i < arr.length; i++){
            //System.out.println("index " + i + " " + "value " + arr[i]);
            System.out.print(arr[i]);
            if( i != arr.length-1){
                System.out.print(",");
            }
        
        }
        System.out.println("");
    }

    // เมธอดรับค่า Array เเละส่งค่า

    static int findMaxInArray(int [] arr){
        int maxValue = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    // เมฑอดหาตำเเหน่งค่าใน array

    static int findMaxIndex(int [] arr){
        int maxIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }

    // เมธอดเปรียบเทียบค่าใน array

    static boolean compareArray(int [] arrA, int [] arrB){
        
        if(arrA.length != arrB.length) return false;

        for(int i = 0; i < arrA.length; i++){
            if(arrA[i] != arrB[i]){
                return false;
            }
        }

        return true ;
    }

    // สลับค่า 

    static void swapElement(int [] arrA, int x, int y){
        // x = start
        // y = end
        // จัดเก็บตำเเหน่งชั่วคราว
        // 10 20 30 => 0, 1, 2

        int temp = arrA[x];
        arrA[x] = arrA[y];
        arrA[y] = temp;

    }

    // คัดลอกค่า array

    static int [] copyArray(int [] arr){
        int [] newArr = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // ค้นหาสมาชิกใน array ค้น String ใช้ arr[i].equals(name)

    static int searchElement(int [] arr, int number){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                index = i;
            }
        }
        return index;
    }
}
