package com.apprentissage.in;

public class SuperHomme extends Humain implements IMilitaire, IDocteur, ICivil{
    @Override
    public void travailler(String bouleau) {
        System.out.println("je suis le super humain et je travaille comme un malade car je suis un "+bouleau);
    }

    @Override
    public void faireDesCourses(String magasin) {
        System.out.println("je suis le super humain et je deteste faire des course chez "+magasin);
    }

    @Override
    public void soigner() {
        System.out.println("je suis le super humain et je suis oblige de soigner pour survivre en mission");
    }

    @Override
    public void consulter() {
        System.out.println("je suis le super humain et je suis doit checker mes etats de sante en permanence");
    }

    @Override
    public void combattre() {
        System.out.println("je suis le super humain et je suis un combattant de feu");
    }

    @Override
    public void proteger() {
        System.out.println("en tant que super humain, je me doit de proteger les simple civil");
    }
}
