public class Lab05 {
    public static void main(String[] args) {
        baseCharacter Gunner = new baseCharacter("Gunner", 20, 10);
        baseCharacter Archer = new baseCharacter("Archer", 15, 15);

        baseAccessories Boots = new baseAccessories("Boots", 3);
        baseAccessories Armor  = new baseAccessories("Armor", 5);

        //Gunner.showStatus();
        //Archer.showStatus();

        // ใส่ Accessories
        Gunner.equipAccessory(Boots);
        Archer.equipAccessory(Armor);
        Archer.equipAccessory(Boots);
        Gunner.showStatus();
        Archer.showStatus();

        // อัปเกรด Accessories
        Boots.upgrade();
        Boots.upgrade();
        Armor.upgrade();

        // แสดงข้อมูล Accessories
        Boots.showAccessoryInfo();
        Armor.showAccessoryInfo();

        // ถอด Accessories
        Archer.unequipAccessory(Boots);
        Archer.showStatus();
    }
}