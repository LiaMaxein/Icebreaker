import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Person {
    private String firstName;
    private String lastName;
    private List<Favourite> favourite;

//    // Konstruktor Person
//    public Person(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.favourite = new ArrayList<>();
//    }

    // Konstruktor Perons Unterricht
    public Person(String firstName, String lastName, List<Favourite> favourite) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favourite = favourite;
    }

    // Methode zum hinzufügen von Favoriten
    public void addFavourite(Favourite favourite) {

    }

    // Methode - ich stelle mich vor
    Scanner eingabe = new Scanner();
    public String introduceMe() {
        String intro = "My name is" + firstName + " " + lastName + ".";
        if (!favourite.size().isEmpty()) {
            if ( favourite.size() == 1;){
                intro = intro + "\n" + "My favourite is ";
            } else{
                intro = intro + "\n" + "My favourites are ";
            }
            for (Favourite favourite : favourite) {
                intro = intro + " a " + favourite.medium + " called " + favourite.getTitle() + ".";
                if (favourite.comment != null) {
                    intro = intro + favourite.comment + "\n";
                }
            }
        }
    }
//        System.out.println("Bitte gib deinen Namen ein:"+ eingabe.nextLine());
//        System.out.println("Hallo, mein Name ist: ");
//        System.out.println("Mein Lieblings-" + Medium.Medium +"Es heißt:" + get.Title.);
//        System.out.println("Was heißt du und was sind deine Lieblings-Dinger");

    }
}
