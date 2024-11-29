import java.util.ArrayList;
import java.util.List;

class baseCharacter implements RPGCharacter {
    String name;
    double hp = 100;
    double mp = 50;
    double atk;
    double def;
    double speed = 10;
    List<Accessories> accessories; // ใช้ List เอาไว้เก็บ Accessories

    public baseCharacter(String name, double atk, double def) {
        this.name = name;
        this.atk = atk;
        this.def = def;
        this.accessories = new ArrayList<>();
    }

    @Override
    public void equipAccessory(Accessories accessory) { //ใส่ Accessories
        System.out.println(".......................");
        if (accessories.size() < 5) {
            accessories.add(accessory);
            accessory.applyEffect(this);
            System.out.println(name + " equipped " + ((baseAccessories) accessory).name);
            if(((baseAccessories) accessory).name == "Boots"){
                speed += 10;
            }
            else if(((baseAccessories) accessory).name == "Armor"){
                hp += 5;
                mp += 3;
                ((baseAccessories) accessory).weight += 5;
                if(hp >= 100) hp = 100;
                if(mp >= 50) mp = 50;
            }
        } else {
            System.out.println("Can't equip more than 5 accessories.");
        }
        System.out.println(".......................");
    }

    @Override
    public void unequipAccessory(Accessories accessory) { //ถอด Accessories
        System.out.println("-----------------------");
        if (accessories.remove(accessory)) {
            accessory.removeEffect(this);
            System.out.println(name + " unequipped " + ((baseAccessories) accessory).name);
            if(((baseAccessories) accessory).name == "Boots"){
                speed -= 10;
            }
        } else {
            System.out.println("Accessory not equipped.");
        }
        System.out.println("-----------------------");
    }

    @Override
    public void showStatus() {
        System.out.println("✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿");
        System.out.println("Status of " + name + ":");
        System.out.println("HP: " + hp + ", MP: " + mp + ", ATK: " + atk + ", DEF: " + def + ", SPEED: " + speed);
        System.out.println("Equipped Accessories: " + accessories.size());
        System.out.println("✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿");
    }
}
