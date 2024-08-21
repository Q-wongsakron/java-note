public class LogicOperator {
    public static void main(String[] args) {
        /*
           AND = &&
           OR = ||
           NOT = ! 
         */

         int a = 10 , b = 20;

         boolean c = (a == b);
         boolean d = (a == b && a < b);
         boolean e = ( a == b || a < b);

         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
    }
}
