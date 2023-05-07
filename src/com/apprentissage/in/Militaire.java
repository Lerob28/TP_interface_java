package com.apprentissage.in;

public class Militaire extends Humain implements  IMilitaire{
    @Override
    public void combattre() {
        System.out.println("couou je suis un Militaire et J'aime bien combattre");
    }
    @Override
    public void proteger() {
        System.out.println("couou je suis un Militaire et J'aime bien proteger");
    }
}
