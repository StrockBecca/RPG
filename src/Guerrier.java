public class Guerrier extends NonMagique {
    Guerrier() {
        super();
    }

    @Override
    public void attack(Personnage persoToAttack) {
        persoToAttack.hp -= 50;
    }
}
