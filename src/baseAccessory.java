public class baseAccessory implements Accessory {
    String name;
    double weight;
    int level;
    baseRPGChar owner;

    public baseAccessory(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.level = 1;
    }

    @Override
    public void upgrade() {
        level++;
    }

    @Override
    public void setOwner(baseRPGChar owner) {
        this.owner = owner;
    }
}
