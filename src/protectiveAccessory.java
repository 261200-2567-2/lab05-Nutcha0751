public class protectiveAccessory extends baseAccessory{
    public protectiveAccessory(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void setOwner(baseRPGChar owner) {
        super.setOwner(owner);
        owner.def += 10;
        owner.mp += 5;
    }
}