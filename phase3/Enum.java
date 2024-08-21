package phase3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

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

public class Enum {

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
