package Phase2;

class Method1{
    public static void main(String[] args) {
        display("Hello");
        plus(1, 2);

        // เมธอดคืนค่ากลับมา
        int resultSub = subtract(10, 5);
        System.out.println(resultSub);
    }
    // รับค่ามา เเต่ไม่ส่งค่าอะไรกลับไป จบการทำงานภายในเมธอด
    static void display(String message){
        System.out.println(message);
    }
    
    static void plus(int num1, int num2){
        int result = num1 + num2;
        System.out.println("sum = "+ result);
    }

    // เมธอดส่งค่าออกมา
    static int subtract(int num1, int num2){
        int result = num1 - num2;

        return result;

    }
}