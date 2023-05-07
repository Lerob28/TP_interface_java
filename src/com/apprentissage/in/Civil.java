package com.apprentissage.in;

public class Civil extends Humain implements ICivil{
    @Override
    public void travailler(String bouleau) {
        System.out.println("couou je suis un Civil et mon boulo c'est :"+bouleau);
    }
    @Override
    public void faireDesCourses(String magasin) {
        System.out.println("couou je suis un Civil et je fais mes courses chez :"+magasin);
    }

    public void danser() {
        System.out.println(" je suis un gentil civil qui ne sait que danser");
    }

    public void manger() {
        System.out.println(" je suis un gentil civil qui mange au minimun 9 fois par jour");
    }
}
