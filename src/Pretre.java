public class Pretre extends Magique {

    Pretre() {
        super();
    }

    public void heal(Personnage persoToHeal) {
        persoToHeal.hp += 15;
    }
}
