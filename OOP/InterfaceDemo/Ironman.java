package InterfaceDemo;

// สืบทอดเเม่ได้เเค่ 1 คน
// class Ironman extends SuperHero,SkillHero {

class Ironman extends SuperHero implements SkillHero {
    public void skill(String skill){
        System.out.println("Skill = " + skill);
    }

    public void moving(String moving){
        System.out.println("Moving = " + moving);
    };

    public void weapon(String weapon){
        System.out.println("Weapon = "+ weapon);
    };

    public void jumping(String jump){
        System.out.println("Jumping = "+ jump);
    };

}
