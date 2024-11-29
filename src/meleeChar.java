import static java.lang.Math.abs;

public class meleeChar extends baseRPGChar{
    public meleeChar(String name, double hp, double mp, double atk, double def, double speed) {
        super(name, hp, mp, atk, def, speed);
    }
    public void meleeAtk(baseRPGChar target){
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!");
        target.hp -= abs(atk - target.def);
        if(target.hp <= 0){
            target.hp = 0;
            System.out.println(target.name + " DEAD!!!");
            return;
        }
        else if(target == this){
            System.out.println("Can't attack!");
            return;
        }
        System.out.println(name + " melee attacking " + target.name);
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
    }
}