public class Gunner extends rangedAtk{
    public Gunner(String name){
        super(name, 100, 50, 20, 15, 10);
    }

    public void shot(baseRPGChar target){
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!");
        target.hp -= 10;
        if(target.hp <= 0){
            target.hp = 0;
            System.out.println(target.name + " DEAD!!!");
            return;
        }
        else if(target == this){
            System.out.println("Can't shot!");
            return;
        }
        System.out.println(name + " is shorting " + target.name);
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
    }
}
