public class Boots extends runAccessory{
    public Boots(String name) {
        super(name, 5);
    }

    @Override
    public void setOwner(baseRPGChar owner) {
        super.setOwner(owner);
        owner.speed += 10;
    }

    @Override
    public void upgrade() {
        super.upgrade();
        owner.speed += 5 * level;
        weight += 3;
    }
}