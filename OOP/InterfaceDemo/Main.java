package InterfaceDemo;

class Main{
    public static void main(String[] args) {
        Ironman h1 = new Ironman();
        h1.setName("Ironman");
        h1.setAge("40");
        h1.skill("shooting");
        h1.displayHero();

        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge("10000");
        h2.skill("Thunder");
        h2.moving("5.0");
        h2.weapon("Hammer");
        h2.jumping("5.0");
        h2.setNation("USA");
        h1.displayHero();
        
    }
}