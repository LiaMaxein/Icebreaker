import java.util.ArrayList;
import java.util.List;

public class IntroductionMain {
    public static void main(String[] args) {
        Person me = new Person("Lia", "Mxn")
        List<Favourite> faves = new ArrayList<>();
        faves.add(new Favourite("Ameise", Medium.BOOK));
        faves.add(new Favourite("Deine Mudda", Medium.SERIES, "Ist nicht so amused."))

        System.out.printf("Uebung Icebreaker");

        // Vorstellung Methode
        introduceMe();

        }
    }
}