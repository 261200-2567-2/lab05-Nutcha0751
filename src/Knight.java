public class Knight extends meleeChar{
    public Knight(String name){
        super(name, 100, 50, 15, 15, 10);
    }

    public void stab(baseRPGChar target){
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!");
        target.hp -= 5;
        if(target.hp <= 0){
            target.hp = 0;
            System.out.println(target.name + " DEAD!!!");
            return;
        }
        else if(target == this){
            System.out.println("Can't stab!");
            return;
        }
        System.out.println(name + " is stabbing " + target.name);
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
    }
}