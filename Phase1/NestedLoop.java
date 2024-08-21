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
