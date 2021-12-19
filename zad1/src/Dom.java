public class Dom implements Budynek
{

    private int okna;
    private double pow;
    private String adres,domowe,ogrodowe;
    private int mieszkancy;


    public double getPow() {
        return pow;
    }
    public void setPow(double pow) {
        this.pow = pow;
    }


    @Override
    public double powierzchnia(double pow) {
        this.pow=pow;
        return pow;
    }


    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }


    @Override
    public int liczbaOkien(int value) {
        this.okna=value;
        return value;
    }
    public void setValue(int value) {
        this.okna = value;
    }
    public int getValue() {
        return okna;
    }



    public int getValue1() {
        this.mieszkancy = mieszkancy;
        return mieszkancy;
    }
    public void setValue1(int value1) {
        this.mieszkancy = value1;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.mieszkancy = value;
    }
    @Override


    public void kolorDomu(KolorEnum kolor) {
    }

    public String getDomowe() {
        return domowe;
    }

    public void setDomowe(String domowe) {
        this.domowe = domowe;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "liczba okien=" + okna +
                ", pow=" + pow +
                ", adres='" + adres + '\'' +
                ", domowe='" + domowe + '\'' +
                ", ogrodowe='" + ogrodowe + '\'' +
                ", liczba mieszkańców=" + mieszkancy +
                '}';
    }

    public void setOgrodowe(String ogrodowe) {
        this.ogrodowe = ogrodowe;
    }

    public String getOgrodowe() {
        return ogrodowe;
    }

    @Override
    public String zwierzeta(String domowe, String ogrodowe) {
        this.domowe=domowe;
        this.ogrodowe=ogrodowe;
        return ogrodowe+" "+domowe;
    }
}
 /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */