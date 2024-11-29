public class runAccessory extends baseAccessory{
    public runAccessory(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void setOwner(baseRPGChar owner) {
        super.setOwner(owner);
        owner.def += 10;
    }

    @Override
    public void upgrade() {
        super.upgrade();
        owner.def += 5 * level;
    }
}