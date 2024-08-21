## Table of contents

- [Quick start](#quick-start)
- [Code](#code)
- [Status](#status)
- [What's included](#whats-included)
- [Bugs and feature requests](#bugs-and-feature-requests)
- [Contributing](#contributing)
- [Creators](#creators)
- [Thanks](#thanks)
- [Copyright and license](#copyright-and-license)


## Quick start

Some text

- Instruction 1
- Instruction 2
- Instruction 3

## Code

Some Text 
```java
    public class demo {
        public static void main (String[] args){
            System.out.println("Hello World")
        }
    }
```

## Type Casting
1. Widening Casting คือการเเปลงข้อมูลขนาดเล็กไปขนาดใหญ่อัตโนมัติ (Auto Casting)
- byte -> short -> char -> int -> long -> float -> double
2. Narrowing Casting คือการเเปลงข้อมูลที่มีขนาดใหญ่ไปสู่ข้อมูลที่มีขนาดเล็กลง (Manual Casting)
- double -> float -> long -> int -> char -> short -> byte
```
    public static void main(String[] args) {
        //แปลงจากเล็กไปใหญ่
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numDouble);

        //เเปลงจากใหญ่ไปเล็ก
        double numDouble2 = 10.0;
        int numInt2 = (int)numDouble2;
        System.out.println(numInt2);
        

        System.err.println("<---------------");

        String a = "100", b = "200";

        
        // string to Integer
        int c;
        c = Integer.parseInt(a);
        c = c + 50;

        // string to double
        double d = Double.parseDouble(a);
        d = d + 3.55;

        // int to string
        int num1 = 100;
        String age = String.valueOf(num1);


 

        a = a + 50; // มันจะเอา string มาต่อกัน เพราะ a เป็น string

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.err.println(d);
        System.err.println(age);

        System.err.println("<----------");
        
        // เช๋คชนิดข้อมูล
        boolean result = a instanceof String;
        System.out.println(result);
    }
     
```
## INPUT From Screen
-   ใช้ lib scanner -> import java.util.scanner
-   มีให้เลือกใช้ คือ  .nextLine, .nextInt, .nextDouble, ...
```
    import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        // รับค่าข้อมูล
        // ข้อมูลเเบบไหน ? ตัวเลข integer, float, long, double, ข้อความ string
        // ข้อความอะไร
        // ข้อความเเบบตัวเลข => คำนวณได้ | คำนวณไม่ได้
        
        // ประกาศใช้งาน class | new (การสร้าง object)
        Scanner sc = new Scanner(System.in);
        System.out.print("input your name = ");
        //next() ไม่อ่านช่องว่างในข้อความ hello world ไม่อ่าน world
        String name = sc.nextLine(); // รับ input via keyboard
        
        System.out.print("input year birdth = ");
        int year = sc.nextInt();



        System.out.println("your name is = "+ name);
        System.out.println("your birdth year is = " + year);
    
    }
}
```
## Escape Charecter
-   ใช้ \ นำหน้าตัวที่ต้องการ
```
public class Escrape {
    public static void main(String[] args) {
        // \n = ขึ้นบรรทัดใหม่
        // \t = tab

        System.out.println("Hello \n World");
    }
}
```

## Logic, Math, Compare, Compound Operator
1. Logic
- AND = &&
- OR = ||
- NOT = ! 
2. Math 
- +, -, *, /, %
3. Compare
- ==, =>, <=, >, <
4. Compound
- +=, -=, *=, /=

## Prepost
- การเพิ่มค่าก่อน หรือ การเพิ่มค่า ให้ตัวเเปรภายหลัง
- ++x = เพิ่มค่า x ก่อนนำไปใช้
- x++ = นำ x ไปใช้ก่อนเเล้วจึงเพิ่มค่า

## IfStatement
1. structure 
- if(condition){
    operator
}
```
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your age(int): ");
        int age = sc.nextInt();

        if(age <= 19){
            System.out.println("young");
        }else if(age >= 20){
            System.out.println("adult");
        }else{
            System.out.println("invalid input");
        }
    }
}
```
2. เเบบลดรูป
- var = (condition) ? command if true : command if false

```
    result = num%2 == 0 ? num + " = เลขคู่" : num + " = เลขคี่";
```

## Switch Case
1. structure
switch(panic){
    case "ปวดหัว" : command;
        break;
    case "ปวดท้อง" : command;
        break;
    default: command;
}

```
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input num month: ");
        int month = sc.nextInt();
        String name = "";
        switch (month) {
            case 1 : 
                name = "Jan";
                break;
            case 2 : 
                name = "Feb";
                break;
            // ...
            default: 
                name = "Invalid Value";
        }
        System.out.println(month + " is "+ name);
    
    }
}
```

## Loop While Loop , For Loop, Do..While Loop
1. Loop คือการทำซ้ำจนกว่าเงื่อนไขจะเป็นเท็จ
2. มีคำสั่งเกี่ยวข้องเช่น break, continue(หยุดทำงานเเล้วย้อนกลับไปเริ่มใหม่ เหมือนกระโดดข้าม)
3. While Loop structure
while(เงื่อนไข){
    คำสั่งทำซ้ำเมื่อเงื่อนไขเป็นจริง
}
```
public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;

        while(count <= 10){
            System.out.println("Hello world "+ count);
            count++;
        }
    }
}
```
4. For Loop Structure
for(ค่าเริ่มต้นของตัวเเปร; เงื่อนไข; เปลี่ยนเเปลงค่าเริ่มต้น){
    คำสั่งเมื่อเงื่อนไขเป็นจริง;
}
```
public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println("Hello World "+ i);
        }
    }    
}
```

5. Do..While
โปรเเกรมจะทำคำสั่ง 1 รอบ เมื่อทำงานเสร็จจะมาเช็คเงื่อไขใน while ก่อนถ้าเป็นจริงก็ทำอีก (ทำก่อนเเล้วเช็คว่ายังจริงอยู่ไหม)

do{
    คำสั่งต้องทำเมื่อเป็นจริง
}while(เงื่อนไข);

```
public class DoWhile {
   public static void main(String[] args) {
        int count = 0;
        do{
            System.out.println("Hello World");
            count++;
        }while(count < 5);
   } 
}
```

ุ6. ข้อเเตกต่าง 
- For ใช้กรณีที่รู้รอบที่ชัดเจน
- While ใช้กรณีที่ไม่รู้รอบที่ชัดเจน
- Do..While ใช้กรณีที่อยากลองทำก่อน 1 รอบ

ุ7. Continue and Break
```
public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 1; i<=10 ; i++){
            if(i==5) break;
            System.out.println(i);
        }
        System.out.println("End Program");
        for(int j = 1; j<=10 ; j++){
            if(j%2 == 0) continue; // ข้ามเลขคู่
            System.out.println(j);
        }
        
    }
}
```

8. Nested Loop
```
public class NestedLoop {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println("out loop "+ i );
            for(int j = 0; j <= 5; j++){
                System.out.println("in loop "+ j);
            }
        }
    }
}
```

## Array
1. เป็น Non primitive data
2. array คือชุดตัวเเปรที่อยู่ในรูปลำดับใช้เก็บค่าข้อมูลในกลุ่มเดียวกัน เก็บบนหน่วยความจำที่ต่อเนื่องกัน ขึ้นอยู่กับจำนวนมิติที่กำหนดขึ้น
3. เป็นตัวเเปรที่ใช้ในการเก็บข้อมูลที่มีลำดับที่ต่อเนื่อง มีค่าได้หลายค่า โดยใช้ชื่ออ้างอิงเพียงชื่อเดียว เเละใช้ index ให้กับตัวเเปรเพื่อจำเเนกความเเตกต่างของค่าตัวเเปรเเต่ละตัว
4. เรียกสมาชิกว่า อิลิเมนต์ เเต่ละ อิลิเมนต์จะเก็บค่าข้อมูล value เเละ index ไว้ เริ่มต้นที่ 0 เเละชนิดข้อมูลเหมือนกัน มีขนาดที่เเน่นอน
5. การประกาศ 
ชนิดข้อมูล [] ชื่อตัวเเปร = new  ชนิดข้อมูล [ขนาด];
int[] number = new int[4]; or = {สมาชิก, ..};
```
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
```

## array 2 dimention
1. เป็น array ที่มีข้อมูลสมาชิกเป็น array เหมือน metrix
2. มีโครงสร้างเเบบ เเถว คือเเนวนอน คอลัมน์ คือเเนวตั้ง
3. การประกาศ
ชนิดข้อมูล[][] ชื่อตัวเเปร = {
    {Array ตัวที่1},
    {Array ตัวที่2}
}
4. การเข้าถึง ชื่อตัวเเปร[เเถว][คอลัมน์]
```
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
```

## Method
1. method คือชุดคำสั่งที่นำมาเขียนรวมกันเป็นกุล่มเพื่อให้เรียกใช้งานตามที่ต้องการ ลดความซ้ำซ้อนของคำสั่งที่ใช้งานบ่อย
2. การสร้างเมธอด เมื่อสร้างสามารถเรียกใช้จากส่วนใดก็ได้ ชึ้นกับขอบเขตเเละระดับการเข้าถึงที่ผู้เขียนกำหนด

```
accress_modifier type name(parameter1, parameter2){
    statement
}
```
3. เมธอดที่ไม่มีการรับเเละส่งค่า
modifier void namemethod(){
    //statement 
}

namemethod();

4. เมธอดที่มีการรับค่าเข้ามาทำงาน
modifier void ชื่อเมธอด(parameter1, parameter2,...){
    //statement
}

อาร์กิวเมนต์ คือ ตัวเเปรหรือค่าที่ต้องการส่งมาให้เมธอด (ตัวเเปรส่ง)
พารามิเตอร์ คือ ตัวเเปรที่เมธอดสร้างไว้สำหรับรับค่าที่จะส่งเข้ามาให้กับเมธอด (ตัวเเปรรับ)

ืnamemethod(argument1, argument2,...)

5. เมธอดที่มีการรับค่าส่งค่าออกมา
modifier type methodname(parameter1, parameter2){
    return ค่าที่จะส่งออกไป (type)
}

## method and array
1. เมธอดที่รับค่า Array (จะไม่สามารถทำงานได้หาก type ที่เรียกใช้ฟังชันไม่เหมือนกัน)
modifier void methodname(type[] arr){
    //statement
}

2. เมธอดที่รับค่า Array เเละคืนค่า
modifier type methodname(type[] arr){
    //statement
    return
}


```
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
```

## Variable Arguments
1. Variable Argument การทำให้ตัว argument รับค่าได้ไม่จำกัด ในลักษณะ array ต้องลูปเอาค่า
```
public class VariableAugment {
    public static void main(String[] args) {
        summation(10,20,30,40);
    }

    public static void summation(int...number){
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            sum += number[i];
        }
        System.out.println("summation: " + sum);
    }
}
```

## Character inDeep
1. create Object Character ด้วย Class
2. เช็ครูปเเบบตัวอักษรด้วย isLetter, isDigit
3. isUpperCase, isLowerCase
4. toUpperCase, toLowerCase

```
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
```

## String inDeep 1
1. สร้าง Object ด้วย Class
2. Concatenation
3. หาความยาว String
4. หาตำเเหน่งตัวอักษร (charAt)
5. เปรียบเทียบ String (equals & equalslgnorecase)
6. หาข้อความหน้าสุด (startWith)
7. หาข้อความท้ายสุด (endsWith)
8. หาตำเเหน่งคำในข้อความ (indexOf)
```
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
```
## String inDeep 2
1. เเทนที่ข้อความ (replace, replaceFirst)
2. การหั่น String (split)
3. หาข้อความย่อย (subString)
4. เเปลง String เป็น Character
5. ตัดช่องว่างใน String
6. เเปลงตัวพิมพ์ใหญ่-เล็ก
7. เเปลงตัวเลขเป็น String(valueOf)

```
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
```

## การจัดการข้อผิดพลาด Exception
1. ตัวอย่าง Exception
- ArrayIndexOutOfBoundsException
- ArithmeticException
- ZeroDivisionException
- IOException
- FileNotFoundException
try{
    //statement
}catch(Exception e){
    //if error do this
}
2. try..catch

3. Finally เกิดข้อผิดพลาดหรือไม่เกิด ก็จะทำงานในส่วนนี้ทุกครั้ง มักเป็นคำสั่งที่สำคัญเช่น ปิดการเชื่อมต่อ db ปิดไฟล์ disconnect server
try{
    ...
}
catch(Exception e){
    ...
}finally{
    ...
}
```
public class ExceptionDemo {
    public static void main(String[] args) {


        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);

            int [] arr = {10,20,30,40};
            System.out.println(arr[100]);
        }catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("donot divide with 0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is inValid");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
```
4. Throw การโยนสิ่งผิดปกติออกไป สามารถสร้าง exception ขึ้นมาได้เองนอกเหนือจาก ที่ java มี
if(...) throw new Exception("error...")

```
import java.util.Scanner;
public class ThrowDemo {
        public static void main(String[] args) {
        try {
            int balance = 5000;

            Scanner sc = new Scanner(System.in);
            System.out.print("Input number withdraw: ");
            int withdraw = sc.nextInt();

            if(withdraw < 0) throw new Exception("Input widthdraw more than 0");
            int total = balance - withdraw;

            if(total <= 0){
                throw new Exception("Your balance not enough");
            }
            System.out.println("total balance: " + total);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

```

5. Exception ใน method ด้วย Throw
```
    // throws Exception ประกาศว่า method นี้มีการ โยน throw exception ใน method
    public static void widthDraw(int amount) throws Exception{
        //จำนวนเงินที่ถอน
        if(amount <= 0) 
        {
            throw new Exception("Input widthdraw more than 0");
        }
        if(amount > balance){
            throw new Exception("Your balance not enough");
        }
        balance -= amount;

        System.out.println("widthDraw: " + amount);
        System.out.println("balance: " + balance);

    }
```
## Java I/O File management
1. FileWriter
-  FileWriter writer = new FileWriter(f);
2. FileReader
- FileReader reader = new FileReader(new File("Demo.txt"));

```
import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("Demo.txt");

        // create file
        try{
            FileWriter writer = new FileWriter(f);
            writer.write("Hello World");
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        // read file จะได้เป็น unicode (int)
        try{
            FileReader reader = new FileReader(new File("Demo.txt"));
            int data;
            while((data = reader.read()) != -1){
                System.out.printf("%c\n", data);
            }
        
        }catch(Exception e){    
            e.printStackTrace();
        }
    }
}

```
3. BufferedWriter เป็นการจัดการข้อมูลขนาดใหญ่ ทำงานได้เร็วกว่า เนื่องจาก มีจุดพักข้อมูล Buffer เเล้วส่งออกทีเดียว
4. BufferedReader

```
import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter(new File("BufferdWrite.txt"));
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write("Hello World \n");
            bw.write("Write With Java");
            bw.close();

            System.out.println("write file done!");
        }catch(Exception e){
            e.printStackTrace();
        }

        // buffered reader
        try{
            FileReader reader = new FileReader(new File("BufferdWrite.txt"));
            BufferedReader br = new BufferedReader(reader);
            
            String mg = "";

            while((mg = br.readLine()) != null){
                System.out.println(mg);
            }


            System.out.println("Read file done!");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
```

## Enum
1. คือสิ่งที่ระบุขึ้นเองหรือหมายถึงตัวแปรที่เป็นรูปเเบบ ค่าคงที่ โดยมีการตั้งชื่อเฉพาะขึ้นมาเพื่อเป็นตัวเเทนของกลุ่มข้อมูล (นิยามชื่อชนิดข้อมูลเอง)
2. ใช้เเทนกลุ่มข้อมูลที่เป็นค่าคงที่
3. เก็บได้เฉพาะค่าที่ประกาศใน enum เท่านั้น
4. ไม่สามารถนำตัวเเปร enum มาใช้ในการคำนวณ
5. สามารถสร้าง method เเละ attribute ใน enum ได้
enum name {
    value1,
    value2,
    ...
}
```
enum Grade {
    A(4.0, "Genius"), 
    B(3.0, "Very Good"), 
    C(2.0, "Good"), 
    D(1.0, "Not Bad"), 
    F(0.0, "Fail") ;
        
    // Attribute  Constructur
    private Grade(double p, String comment){
        this.point = p;
        this.description = comment;
    }
    public final double point;
    
    public final String description;
    // Method 
    double getPoint() {
        return switch (this) {
            case A -> 4.0;
            case B -> 3.0;
            case C -> 2.0;
            case D -> 1.0;
            default -> 0.0;
        };
    }
}

public class Phase3 {

    public static void main(String[] args) {
        Grade myGrade = Grade.A;
        //System.out.println("Grade =  + "+myGrade+", "+myGrade.getPoint());
        System.out.println("Grade =  "+myGrade+", "+myGrade.point);
        System.out.println("Result = " + myGrade.description);
//        for (Grade option : Grade.values()) {
//            System.out.println(option);
//
//        }
    }
}
```

## Generic Classes
1. เป็นกระบวนการจัดการประเภทข้อมูลที่ระบุอยู่ภายในคลาสเเละเมธอดให้มีความยืดหยุ่นตามการเรียกใช้งาน โดยรูปเเบบการระบุประเภทข้อมูลนั้นจะเขียนใน <>
2. ใช้ในการเเก้ปัญหาเช่น การเก้บค่าในคลาส ไม่สามารถเก็บได้หลาย type 
3. เรียกอีกชื่อว่า Parameterized Class หมายถึง คลาสที่สามารถมี parameter ได้ เรียกว่า "Type Parameter" สำหรับจัดการเกี่ยวกับประเภทข้อมูลภายในคลาส ใช้ Wrapper Class
- class ClassName<T (เป็นตัวเเทนของประเภทข้อมูลหรือคลาสที่สนใจ)> {

}
- การเรียกใช้ Classname<type1> objectName = new ClassName<>(param)

4. Bounded Type Parameter คือการกำหนดข้อบังคับหรือขอบเขตในการจัดการประเภท ข้อมูลที่อยู่ใน Type Parameter
- class ClassName<T extends type>{

}
5. Multiple Type Parameter
- class ClassName<T, U(ตัวเเทนของประเภทข้อมูลตัวที่ 2)>{

}

6. Generic Method คือการสร้างเมธอดที่สามารถจัดการข้อมูลต่างกันได้
- <T> void methodName(T parameter){
    //state
}
- <T> T methodName(T parameter){
    //state
}
```
// Generic class
class Item<T> {
    T data;
    //constructur
    public Item(T value){
        data = value;
    }
}
// Multi type Generic class
class Person<T extends String, U extends Integer>{
    T name;
    U age;
    public Person(T name, U age){
        this.name = name;
        this.age = age;
    }
}

// Normal class
class ItemInt{
    int data;
    public ItemInt(int value){
        data = value;
    }
}

// Generic Method
class Data{

    // generic method
    static <T> void showArrayGen(T[] arr){
        for(T element : arr){
            System.out.println(element);
        }
    }

    // normal method
    static void showArrayStr(String[] arr){
        for(String element: arr){
            System.out.println(element);
        }
    }
    
    static void showArrayInt(Integer[] arr){
        for(int element: arr){
            System.out.println(element);
        }
    }


}

public class Generic {
    public static void main(String[] args) {
        // normal class
        ItemInt obj1 = new ItemInt(10);
        System.out.println(obj1.data);

        // call Generic class
        Item<Double> obj2 = new Item<>(99.99);
        System.out.println(obj2.data);

        Item<Character> obj3 = new Item<>('C');
        System.out.println(obj3.data);

        // multiple type
        Person<String, Integer> obj4 = new Person<>("wongsakron", 23);
        System.out.println(obj4.name);
        System.out.println(obj4.age);

        // normal method
        String[] message = new String[]{"hello", "one"};
        //Data.showArray(new String[]{"hello", "world"});
        Data.showArrayStr(message);
        Data.showArrayInt(new Integer[]{1,3,5,7,9});



        // generic method
        Data.showArrayGen(new Double[]{11.11,22.22,33.33});
        Data.showArrayGen(new Character[]{'x','y','o'});
        
    }
}
```
## Collection
1. เป็นตัวจัดการกลุ่มข้อมูลที่ใช้เก็บข้อมูลหลายๆค่าเอาไว้ด้วยกันทำให้เราจัดการข้อมูลได้ง่าย เเละสะดวกมากขึ้น ทั้งยังมี ความยืดหยุ่น สามารถเพิ่มเเละลดขนาดได้เองอัตโนมัติตามข้อมูลที่มีอยู่
2. การใช้งาน collection จะเรียกใช้ผ่าน package java.util

## ArrayList จัดการข้อมูลเเบบ Array ในรูปเเบบ Dynamic Size
- class ArrayList เป็นหนึ่งในกลุ่ม Collection ที่ใช้เก็บข้อมูลเหมือน Array เเต่ สามารถย่อเเละขยายการเก็บข้อมูลได้อัตโนมัติ
- การสร้าง array ปกติต้องกำหนด size ไว้ซึ่งไม่สามารถ ใช้งานเกินขนาดที่กำหนดไว้ซึ่งต้องรู้ว่าจะเก็บข้อมูลอะไรบ้าง ขนาดเท่าไหร่
- Array ขนาดคงที่ ระบุล่วงหน้า เก็บข้อมูลชนิดพื้นฐานหรือวัตถุ
- ArrayList ขนาดยิดหยุ่น ไม่ต้องระบุล่งหน้า ใช้เก็บวัตถุ (คลาส Object) ArrayList<Integer> ArrayList<String> 
- ArrayList<class_name> ชื่อตัวเเปร = new ArrayList<>();
- ex method add(element), add(index,element), addAll([element]) เพิ่มหลายรายการ, addAll(index,[element])
- size(), get(index), set(index,element) เปลี่ยนข้อมูลใน index ที่กำหนด, contains(element) เช็คว่ามีสมาชิกใน array ไหม
- clear() ลบสมาชิกทั้งหมด, remove(element), remove(index), indexOf(element)

## HashSet จัดการข้อมูลไม่ซ้ำกัน
- มีลักษณะการทำงานคล้ายกับ ArrayList โดยข้อมูลหรือสมาชิกที่เก็บใน HashSet นั้นต้องมี "ค่าไม่ซ้ำกัน" เเต่สมาชิกใน HashSet นั้นจะไม่มีการเรียงลำดับที่ถูกเพิ่มเข้ามา
- HashSet <class_name> ชื่อตัวเเปร = new HashSet<>();
- add(element), size(), contains(element), clear() , remove(element)

- LinkedHashSet มีลักษณะคล้ายกับ HashSet เเต่สมาชิกจะเรียงลำดับที่ถูกเพิ่มเข้ามา
- TreeSet มีลักษณะคล้ายกับ HashSet เเต่สมาชิกจะเรียงลำดับจากน้อยไปมาก, ตามลำดับตัวอักษร หรือตามที่กำหนด
## HashMap จัดการความสัมพันธ์ของข้อมูล
- เป็นรูปเเบบการเก็บความสัมพันธ์ของข้อมูลในลักษณะของ key เเละ value กล่าวคือจะใช้ key เป็น index ในการเข้าถึง ข้อมูล (value) เเต่ละตัว ซึ่งค่า key จะต้องไม่ซ้ำ
- HashMap<key_type, value_type> ชื่อตัวเเปร = new HashMap<>();
- put(key, element), get(key), size()
- clear(), remove(key), containsKey(key) หา่ามี key นี้ไหม, containValue(value) หาว่ามีค่านี้ไหม

## Package
1. คือสิ่งที่ช่วยให้ผู้พัฒนาโปรเเกรมสามารถจัดการ Class เเละ Interface ออกเป็นกลุ่มการทำงานเเต่ละส่วนได้ ด้วยวิธีการเเยกไฟล์ออกเป็นหมวดหมู่ต่างๆ ตามรูปเเบบการทำงาน ส่งผลให้โค้ดมีความเป็นระเบียบเเละนำกลับมาใช้งานใหม่ได้ง่ายเเละสะดวกมากยิ่งขึ้น
- การนำคลาสมาใส่เเพ็กเกจ package ชื่อเเพ็กเกจ;
- เเพ็กเกจย่อย package ชื่อเเพ็กเกจหลัก.ชื่อเเพ็กเกจย่อย;
- การอ้างอิงคลาสในเเพ็กเกจ ชื่อเเพ็กเกจ.ชื่อคลาส;
- การ import คลาสจากเเพ็กเกจอื่น 
 - import package_name.class_name; (import เฉพาะคลาสที่สนใจใน package)
 - import package_name.*; (import ทุกคลาสใน package)



## OOP
1. Object Oriented Programming Language
- การพัฒนาโปรเเกรมเป็นการเลียนเเบบการทำงานเชิงออปเจ็ค การออกเเบบให้วัตถุมีความเป็นอิสระต่อกัน ทำได้ง่ายด้วยคุณสมบัติเชิงวัตถุสามารถนำโปรเเกรมกลับมาใช้ใหม่ Reuse ได้ดีกว่าภาษาเชิงกระบวนการ
- กำหนดปัญหาเป็นองค์ประกอบ(object)
- เอาส่วนโปรเเกรมเเละข้อมูลเป็นส่วนเดียวกัน
- การเเก้ไขไม่กระทบส่วนอื่นๆ
2. ภาษาเชิงกระบวนการ (Procedural Programming Language)
- โปรเเกรมจะเเบ่งออกเป็นส่วนย่อยๆ เรียกว่า โมดูล(Module) เเต่ละ โมดูลควรออกเเบบให้มีการทำงานเพียง 1 งานเท่านั้น การออกเเบบเเต่ละโมดูลมีความเป็นอิสระต่อกันทำได้ยาก
3. ลักษณะพื้นฐาน
- class & object
- การห่อหุ้ม Encapsulation
- การสืบทอดคุณสมบัติ Inheritance
- การพ้องรูป Polymorphism

4. คลาส(class) คือต้นเเบบของวัตถุ การจะสร้างวัตถุขึ้นมาอย่างหนึ่ง จะต้องสร้างคลาสขึ้นมาเป็นโครงสร้างต้นเเบบสำหรับวัตถุก่อนเสมอ

5. วัตถุหรือออบเจ็ค(object) คือสิ่งที่ถูกสร้างมาจากคลาสประกอบไปด้วยคุณสมบัติ 2 ประการ คือ คุณลักษณะ เเละพฤติกรรม

6. คุณลักษณะ(attribute หรือ data member)  fields คือสิ่งที่บ่งบอกลักษณะทั่วไป ของวัตถุ

7. พฤติกรรม(behavior หรือ method) คือพฤติกรรมทั่วไปของวัตถุที่สามารถกระทำได้ เช่นทำอะไรได้บ้าง เดิน วิ่ง นั่ง บวกเลข ลบเลข

8. การเข้าถึง Accress Modifier คือ ระดับการเข้าถึง class , attribute, method เเละอื่นๆในภาษาเชิงวัตถุ โดยมีประโยชน์ อย่างมากในเรื่องของการกำหนดระดับการเข้าถึง สิทธิในการเข้าใช้งาน เเละการซ้อนข้อมูล เเละอื่นๆ

9. public เป็นการประกาศระดับการเข้าถึงเข้มงวดน้อยสุด ใครก็สามารถ เข้าใช้งานได้

10. Protected เป็นการประกาศระดับการเข้าถึงที่เกี่ยวข้องกับการสืบทอด (Inheritance) คลาสที่อยู่ใน เเพ็กเกจเดียวกันกับคลาสที่ถูกกำหนด modifier เป็น protected จะสามารถเรียกใช้งานสมาชิกของคลาสที่ถูกกำหนดเป็น protected ได้

11. Private เป็นการประกาศระดับการเข้าถึงที่เข้มงวดที่สุดกล่าวคือจะมีเเต่คลาสของตัวมันเองเท่านั้นที่มีสิทธิ์ใช้งานได้

12. การห่อหุ้ม Encapsulation การทำให้ไม่เห็นเข้าถึงไม่ได้ เเก้ไขไม่ได้ จะเเก้ไข้โดยตรงไม่ได้ ต้องเรียกใช้ผ่าน method 
- เป็นกระบวนการซ่อนรายละเอียดการทำงานข้อมูลไว้ภายในไม่ให้ภายนอกสามารถมองเห็นได้
- ทำให้ภายนอกไม่สามารถเปลี่บนเเปลงเเก้ไชข้อมูลภายในได้ซึ่งเป็นผลทำให้เกิดความเสียหายเเก่ข้อมูล
- ข้อดีของการห่อหุ้มคือสามารถสร้างความปลอดภัยให้เเก่ข้อมูลได้เนื่องจากข้อมูลจะถูกเข้าถึงจากผู้มีสิทธิ์เท่านั้น

13. การสืบทอดคุณสมบัติ Inheritance สืบทอดความสารถบางส่วนของ คลาสเเม่ คลาสลูกสามารถใช้ method ของคลาสเเม่ได้
- การนิยามคลาสใหม่จากรูปเเบบของคลาสที่มีอยู่เเล้วโดยคลาสใหม่จะนำ attribute เเละ method ของคลาสเดิมมาใช้ได้
- สามารถนำโปรเเกรมเดิมมาพัฒนาเพิ่มเติมได้ใหม่ง่ายขึ้น re use 
- ทำให้โปรเเกรมมีขนาดเล็ก ช่วยให้เข้าใจง่ายเเละปรับปรุงเเก้ไข
- ส่งผลให้เกิด overriding method คือ เมธอดคลาสลูก subclass ที่มีชื่อเหมือนกับเมธอดของคลาสเเม่ super class

14. This and Super keyword
- key word this การใช้ keyword this คือเมื่อต้องการเรียกใช้งานคอนสตรัคเตอร์อื่นๆ ที่อยู่ภายในคลาสเดียวกัน
- key word Super เมื่อต้องการเรียกคอนสตรัคเตอร์ของตลาสเเม่ให้ทำงานคีย์เวิร์ด super ในการเรียกใช้งานคอนสตรีคเตอร์ของคลาสเเม่จะต้องทำการเรียกที่บรรทัดเเรกสุดของคอนสตรัตเตอร์นั้นๆ เท่านั้น เช่น เรียกคอนสตรัก จากคลาสเเม่จากคลาส ลูก

15. การพ้องรูป Polymorphism ชื่อเดียวกันเเต่ความสามารถหลายเเบบ ตอบสนองต่อ method เดียวกันด้วยวิธีการที่ต่างการสามารถกำหนด obj ได้หลายเเบบ
- poly หลากหลาย morphology รูปเเบบ
- การที่เมธอดชื่อเดียวกันสามารถรับ อาร์กิวเมนต์ที่เเตกต่างกันได้หลายรูปเเบบโดยเมธอดนี้จะถูกเรียกว่า overload method

16. Overloading & Overriding Method
- Overloading Method คือ เมธอดที่มีชื่อเหมือนกัน มีหน้าที่เหมือนกัน เเละอยู่ภายในคลาสเดียวกัน สิ่งที่เเยกความเเตกต่างของเมธอดที่เป็น overload method คือ พารามิเตอร์ ที่เเตกต่างกัน(เป็นผลมาจากคุณสมบัติ OO หรือ polymorphism)

- Overriding method คือ เมธอดของคลาสลูก (subclass) เป็นการกำหนดการทำงานให้กับเมธอดที่สืบทอด ที่มีชื่อเหมือนกับเมธอดของคลาสเเม่ superclass เเต่มีความต่างกัน เช่นเเเม่พนักงานทุกตำเเหน่ง bonus = 10% ลูกทำการ overriding method ที่กำหนด bonus เป็น 20%  เป็นผลมาจากคุณสมบัติ OO คือ inheritance เช่น เเม่เป็นโรค ลูกก็เป็นโรคเเค่มีความเเตกต่างนิดนห่อย , พนักงาน ก็มีลูกเป็น เเต่ละ ตำเเหน่งโดยเเต่ละตำเเหน่งก็ มีชื่อ รหัสพนง เหมือนกัน เเต่ต่างที่โบนัสหรือเงินเดือนของเเต่ละตำเเหน่ง

17. Constructor กำหนดค่าเริ่มต้นให้คลาสหรือ obj
- เป็น method พิเศษที่จะถูกสั่งให้ทำงานโดยอัตโนมัติเมื่อมีการสร้างวัตถุขึ้น เพื่อกำหนดค่าเริ่มต้นให้กับตัวเเปรคลาสของวัตถุ
- มีชื่อเหมือนชื่อคลาส
- method มีการคืนค่ากลับ เเต่ constructor ไม่มีการคืนค่ากลับ
- ประกาศเข้าถึงเเบบ public

18. Non- access modifier : static ใช้สำหรับเรียกใช้โดยไม่ต้องสร้าง obj
- กำหนดหน้า method หรือ ตัวเเปรเพื่อให้เป็นเเบบ Static
- เรียก static method จำทำให้เราสามารถเรียกใช้งาน method นั้นโดยไม่ต้องสร้าง object
- การกำหนดให้ข้อมูลเป็น static เรียกว่า static attribute จะทำให้เราสามารถเรียกใช้งานโดยไม่ต้องสร้าง ออปเจ็กขึ้นมาก่อน

19. modifier : final
- ใช้ final กำหนดให้กับ class, method, attribute
- final class จะทำให้คลาสนั้นไม่สามารถมี subclass ได้
- final methof ทำให้ method ไม่สามารถ override method ได้
- final data or attribite จะทำให้เป็นค่าคงที่ constant

20. abstract Class เหมือนบังคับให้คลาสลูกทุกตัวต้องสร้างเมธอดนี้ ขึ้นมาด้วย override เป็นเเค่ชื่อเหมือนกับการ ดีไซน์ ไว้ก่อน ยังไม่มีการกำหนดการทำงาน  เช่น พ่อ คลาสเอ มีเมธอด abstract ต้องประกาศ class เป็น abstract ด้วย จากนั้น b เป็นลูกสืบทอดคลาส a ซึ่งจะได้สืบทอด abstract method ของ a ลูก b ต้องทำการกำหนดค่าให้กับ abstract method ของ a
- abstract เป็นคีย์เวิร์ดในภาษาจาวา สามารถกำหนดคีย์เวิร์ด abstract นี้ให้กับคลาสหรือเมธอดก็ได้
- abstract method คือ เมธอดว่างเปล่าที่ยังไม่ได้มีการกำหนดรายละเอียดการทำงานลงไป จะถูกกำหนดรายละเอียดลงไปภายหลัง โดยคลาสลูกที่ได้รับการสืบทอดจากคลาสของ abstract method เหล่านั้น
- abstract class หากคลาสใดก็เเล้วเเต่ที่ประกอบไปด้วยเมธอดที่เป็น abstract method เพียงเมธอดเดียวจะต้องประกาศคลาสนั้นเป็น abstract ด้วย
- กฎของ abstract หาคลาสใดสืบทอดมาจาก abstract class คลาสนั้นจะต้องทำการระบุเมธอดทุกเมธอดที่เป็น abstract method ใน abstract class ไว้เสมอ (ไม่กำหนดรายละเอียดก็ได้เเต่จะต้องเขียนน abstract method ทุก เมธอดลงไปในคลาสนั้นด้วย)

21. Interface เมธอดปกติไม่สามารถ สร้างขึ้นมาได้ใน interface มีได้เพียง abstract method ทั้งหมด เเล้วค่อยไปกำหนดค่าในคลาสลูกที่ไปเรียกใช้ Interface "ข้อดีคือ คลาสลูกสามารถสืบทอดได้มากกว่า 1 คลาสจากการใช้ abstract class โดยเปลี่ยนมาใช้ implement interface"
- มีหลักการคล้ายกับ abstract class คือสร้างอินเทอร์เฟซขึ้นมาเพื่อกำหนดโครงสร้างของเมธอดที่จำเป็นใช้งานขึ้นมาเเต่ยังไม่ได้กำหนดรายละเอียดการทำงานใดๆลงไป ให้กับเมธอดนั้น abstract method เมธอดในอินเทอร์เฟซจึงเป็นเมธอดว่างเปล่าซึ่งในภายหลังจึงมีการกำหนดรายละเอียดของเมธอดเหล่านั้นลงไป โดยถูกกำหนดโดยคลาสที่เรียกใช้อินเทอร์เฟซนั้นๆ

- เมธอดใน abstract class ไม่เป็น abstract method ก็ได้เเต่เมธอดทุกเมธอดใน interface เป็น abstract method
- คลาสที่จะเรียกใช้งาน abstract method ใน abstract class จะต้องสืบทอดคุณสมบัติไปจาก abstract class นั้นเเล้วจึงทำการสร้างเมธอดของตัวเองขึ้นมาให้มีชื่อเดียวกับ abstract method ใน abstract class โดยกำหนดรายละเอียดการทำงานให้กับ abstract method เหล่านั้นตามต้องการ
- เเต่คลาสที่จะเรียกใช้งานเมธอดในอินเทอร์เฟซไม่จำเป็นต้องมีความสัมพันธ์ใดๆ กับอินเทอร์เฟซทั้งสิ้น

- การใช้ interface คือ ทำการ อิมพลีเมนต์ (implements) อินเทอร์เฟซใด "จะต้องเขียนเมธอดที่มีอยู่ในอินเทอร์เฟซนั้นให้ครบทุกเมธอด" คือไม่ว่าจะต้องการกำหนดรายละเอียดให้เเก่เมธอด หรือไม่ต้องกาารกำหนดรายละเอียดให้กับเมธอด จะต้องเขียนเมธอดเหล้านั้นให้ครบ ไม่เช่นนั้นจะเกิดข้อผิดพลาดขึ้นในขณะคอมไพร์โปรเเกรม

- tip abstract class จะสืบทอดได้เเค่คลาสๆเดียว เช่นมี abstract class 4 คลาส คลาสลูกจะสืบทอดได้เเค่คลาสเดียวเท่านั้น เเต่ interface จะสืบทอด หรือ implement interface ได้หลายคลาส
