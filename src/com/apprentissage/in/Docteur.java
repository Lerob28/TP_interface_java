package com.apprentissage.in;

public class Docteur extends Humain implements IDocteur{
    @Override
    public void soigner() {
        System.out.println("couou je suis un Docteur et J'aime bien soigner");
    }
    @Override
    public void consulter() {
        System.out.println("couou je suis un Docteur et J'aime bien consulter");
    }
}
