public class Lab05 {
    public static void main(String[] args) {
        Gunner g = new Gunner("Gunner");
        Knight k = new Knight("Knight");
        g.showStatus();
        k.showStatus();

        Boots b = new Boots("Boots");
        Armor a = new Armor("Armor");

        g.equip(b);
        g.equip(a);
        k.equip(b);

        b.upgrade();
        b.upgrade();
        a.upgrade();

        g.shot(k);
        k.showStatus();
        k.stab(g);
        g.showStatus();
    }
}