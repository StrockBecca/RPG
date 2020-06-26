import RNG.IRng;
import RNG.Rng;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Rng.setImpl(percentage -> ThreadLocalRandom.current().nextInt(0, 100 + 1) < percentage);

        System.out.println("Hello World!");
    }
}
