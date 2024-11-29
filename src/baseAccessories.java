class baseAccessories implements Accessories {
    String name;
    double weight;
    int level = 1;
    double maxLevel = 5;

    public baseAccessories(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void applyEffect(baseCharacter character) { //ถ้าใส่ Accessories จะเพิ่ม Def
        character.def += 5 * level;
        character.atk += 3 * level;
    }

    @Override
    public void removeEffect(baseCharacter character) { //เมื่อถอด Accessories จะลบสถานะของ Accessories นั้นๆ ด้วย
        character.def -= 5 * level;
        character.atk -= 3 * level;
    }

    // ฟังก์ชันอัปเกรดอุปกรณ์
    public void upgrade() {
        System.out.println("++++++++++++++++++++++");
        if (level < maxLevel) {
            level++;
            System.out.println(name + " has been upgraded to level " + level + "!");
        } else {
            System.out.println(name + " is already at max level.");
        }
        System.out.println("++++++++++++++++++++++");
    }

    // แสดงข้อมูลอุปกรณ์
    public void showAccessoryInfo() {
        System.out.println("✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿");
        System.out.println("Accessory: " + name + ", Weight: " + weight + ", Level: " + level);
        System.out.println("✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿");
    }
}
