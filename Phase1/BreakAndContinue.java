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
