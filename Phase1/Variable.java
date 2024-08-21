public class Variable {
	public static void main(String[] args) {
		//นิยามตัวเเปร
		int number1; 

        //พร้อมค่าเริ่มต้น
		final int number2 = 10; // final set ให้ค่าคงที่

        //นิยามพร้อมกันหลายตัว
		boolean bool1 = true, bool2 = false;

        System.out.println("ค่าตัวเลขที่2 = " + number2);


        //Global and Local
        int a = 100;// global var
        int b = 200;
        System.out.println(a);
        {
            int c = 300; // local var
            System.out.println(c);
        } // end local

        //Min Max Value
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
	}
}