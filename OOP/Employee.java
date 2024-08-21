abstract class Employee {
    // Attribute
    private String id;
    private String name;
    private Double salary;
    
    // Static attrivute
    static int minSalary = 10000;
    //Default constructor
    public Employee(){
        // this.id = "0";
        // this.name = "start";
        // this.salar  y = 0.0;
        System.out.println("I am employee");
    }
    // Custom constructor
    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }


    // set Method
    public void setId(String id){
        // this คือ id ใน class นี้ ไม่ใช้ this คือ parameter จากข้างนอก
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void displayEmployee(){
        //System.out.println("ID = "+ this.id);
        System.out.println("Name = "+ this.name);
        System.out.println("Salary = "+ this.salary);
    }

    // get Method
    public String getName(){
        return this.name;
    }

    public Double getSalary(){
        return this.salary;
    }

    // abstract class 
    public abstract void bonus();
}