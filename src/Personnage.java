public abstract class Personnage {
    protected int hp;

    Personnage() {

    }

    public void attack(Personnage persoToAttack) {
        persoToAttack.hp -= 10;
    }
}
