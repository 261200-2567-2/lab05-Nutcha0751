public class Armor extends protectiveAccessory{
    public Armor(String name) {
        super(name, 7);
    }

    @Override
    public void setOwner(baseRPGChar owner) {
        super.setOwner(owner);
        owner.hp += 10;
    }

    @Override
    public void upgrade() {
        super.upgrade();
        owner.hp += 5 * level;
        weight += 5;
    }
}