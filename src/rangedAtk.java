public class rangedAtk extends baseRPGChar{
    public rangedAtk(String name, double hp, double mp, double atk, double def, double speed) {
        super(name, hp, mp, atk, def, speed);
    }

    public void rangedAtk(baseRPGChar target){
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!");
        target.hp -= 5;
        if(target.hp <= 0){
            target.hp = 0;
            System.out.println(target.name + " DEAD!!!");
            return;
        }
        else if(target == this){
            System.out.println("Can't attack!");
            return;
        }
        System.out.println(name + " range attacking " + target.name);
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
    }
}
