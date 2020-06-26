import RNG.IRng;
import RNG.Rng;
import org.junit.Assert;
import org.junit.Test;

public class AttackTest {
    @Test
    public void testGuerrierAttackMagicalPersonnage() {
        Personnage attaquant = new Guerrier();
        Personnage victime = new Pretre();

        attaquant.attack(victime);

        PrintPerso.printPerso(victime);

        Assert.assertEquals(30, victime.hp);
    }


    @Test
    public void testMagicienDoesCriticalDamage() {
        Rng.setImpl(percentage -> true);


        Magicien m = new Magicien();
        NonMagique victime = new Guerrier();

        m.lancerSort(victime);

        Assert.assertEquals(m.getMana(), 85);
        Assert.assertEquals(victime.hp, 70);
    }

    @Test
    public void testMagicienDoesntDoCriticalDamage() {
        Rng.setImpl(percentage -> false);


        Magicien m = new Magicien();
        NonMagique victime = new Guerrier();

        m.lancerSort(victime);

        Assert.assertEquals(85, m.getMana());
        Assert.assertEquals(80, victime.hp);
    }

}
