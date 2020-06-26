package RNG;


public class Rng {

    public static IRng impl;

    public static void setImpl(IRng impl) {
        Rng.impl = impl;
    }
}
