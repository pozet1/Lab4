import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dom dom1 = new Dom();
        dom1.setAdres("Gdynia");
        dom1.setDomowe("Pies");
        dom1.setOgrodowe("Brak");
        dom1.setPow(55);
        dom1.setValue(43);
        dom1.setValue1(100);

        System.out.println();

        Budynek dom2 = new Dom();
        dom2.adresBudynku("Puck");
        dom2.zwierzeta("Kot","koń");
        dom2.powierzchnia(56.7);
        dom2.liczbaOkien(2);
        dom2.liczbaMieszkancow(6);

        System.out.println(dom1.toString());
        System.out.println(dom2.toString());





    }
}




/* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

