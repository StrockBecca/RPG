import RNG.Rng;

public class Magicien extends Magique {
    Magicien() {
        super();
    }

    public void lancerSort(Personnage perso) {

        int dmg = 20;
        if (Rng.impl.doesHappenWithProbability(10)) {
            dmg += 10;
        }

        perso.hp -= dmg;
        this.mana -= 15;
    }
}
