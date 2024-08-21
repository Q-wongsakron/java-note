class Accounting extends Employee{

    public String skill = "Manage money";
    public Accounting(String name, Double salary){
        // call constructor super class
        super(name,salary);
        System.out.println("I am Accounting");
    }

    // abstract method บังคับจาก คลาสเเม่
    public void bonus(){
        System.out.println("bonus = 30%");
    };
}
