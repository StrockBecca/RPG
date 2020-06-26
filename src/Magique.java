
public abstract class Magique extends Personnage {
    protected int mana;

    Magique() {
        super();
        this.hp = 80;
        this.mana = 100;
    }

    public int getMana() {
        return mana;
    }
}
