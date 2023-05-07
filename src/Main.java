import com.apprentissage.in.Civil;
import com.apprentissage.in.Docteur;
import com.apprentissage.in.Militaire;
import com.apprentissage.in.SuperHomme;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SuperHomme pavel2 = new SuperHomme();
        Militaire borel = new Militaire();

        pavel2.saluer("Coucou ici");
        pavel2.travailler("Espion");
        pavel2.soigner();
        pavel2.combattre();
        borel.combattre();


    }
}