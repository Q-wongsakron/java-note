public class Main {
    public static void main(String[] args) {
        // abstract เรียก Employee ไม่ได้
        // Employee e1 = new Employee(); // create object
        // e1.setId("1");
        // e1.setName("Wongsakron");
        // e1.setSalary(20000.0);
        // System.out.println("Name = " + e1.getName());
        
        // // custom constructor
        // Employee e2 = new Employee("wongsakron", 10000.0); // create object
        // //e2.setId("2");
        // //e2.setName("Gojo");
        // //e2.setSalary(25000.0);
        // e2.displayEmployee();

        // static
        System.out.println(Employee.minSalary);


        // Inheritance
       //Programer p1 = new Programer("admin", 5000.0);
        Accounting a1 = new Accounting("acount1", 10000.0);
        // p1.setName("GM");
        // p1.setSalary(40000.0);
        // p1.displayEmployee();

        // call Overloading
        Programer p2 = new Programer();
        p2.skill("Java", "SQL");
        Programer p3 = new Programer();
        p2.skill("R", "C", "C++", "SQL");

        p2.bonus();
        a1.bonus();
    }
}
