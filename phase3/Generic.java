package phase3;

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
