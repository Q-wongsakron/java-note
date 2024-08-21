class Programer extends Employee {
    // inherithance
    // public String skill = "Java";
    // public Programer(String name, Double salary){
    //     // call constructor super class
    //     super(name, salary);
    //     System.out.println("i am programer");

    //     // setId("1");
    //     // setName("GM");
    //     // setSalary(40000.0);
    //     //System.out.println("I am Programmer");
    // }
    

    // overloading method
    public void skill(){
        System.out.println("No Skill");
    }

    public void skill(String language){
        System.out.println("Skill = "+ language);
    }

    public void skill(String l1, String l2){
        System.out.println("Skill = "+ l1 + ", " + l2);
    }

    public void skill(String...language){
        for(int i = 0 ; i < language.length ;i++){
            System.out.println("skill = "+ language[i]);
        }
    }


    // Override
    public void bonus(){
        System.out.println("Bonus = 20%");
    }
}
