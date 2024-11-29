import java.util.ArrayList;
import java.util.List;

public class baseRPGChar implements RPGCharacter{
    String name;
    double hp;
    double mp;
    double atk;
    double def;
    double speed;
    ArrayList<baseAccessory> accessories = new ArrayList<baseAccessory>();

    public baseRPGChar(String name, double hp, double mp, double atk, double def, double speed) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.speed = speed;
    }

    @Override
    public void equip(baseAccessory accessory) {
        accessories.add(accessory);
        accessory.setOwner(this);
        speed -= accessory.weight;
        System.out.println("\n+++++++++++++++++++++");
        System.out.println(name + " equipped " + accessory.name);
        System.out.println("+++++++++++++++++++++");
    }

    @Override
    public void showStatus() {
        System.out.println("\n>>>>>>>>>><<<<<<<<<<");
        System.out.println("Name : " + name + " Hp : " + hp + " Mp : " + mp + " Atk : " + atk + " Def : " + def + " Speed : " + speed);
        System.out.println(">>>>>>>>>><<<<<<<<<<");
    }
}
