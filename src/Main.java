import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię, nazwisko, wiek i nr albumu");

        String imie = scan.next();
        String nazwisko = scan.next();
        int wiek = scan.nextInt();
        int album = scan.nextInt();

        System.out.println("Imię i nazwisko: " + imie + " " + nazwisko + "; " + "wiek: "+ wiek + "; " + "nr albumu: "  + album);
        System.out.printf("Imię:  %S \n", imie);
        System.out.printf("Nazwisko: %S \n", nazwisko);
        System.out.printf("Wiek: %d \n", wiek);
        System.out.printf("Nr albumu: %d \n", album);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.println("Podaj a: ");
        int a = scan.nextInt();
        System.out.println("Podaj b: ");
        int b = scan.nextInt();

        int suma = a + b;
        int roznica = a - b;
        int iloczyn = a * b;
        int iloraz = a / b;
        int reszta = a % b;

        System.out.printf("Wynik %s to %d \n", "dodawania", suma );
        System.out.printf("Wynik %s to %d \n", "odejmowania", roznica);
        System.out.printf("Wynik %s to %d \n", "mnozenia", iloczyn);
        System.out.printf("Wynik %s to %d \n", "dzielenia", iloraz);
        System.out.printf("Wynik %s to %d \n", "dzielenia z reszta", reszta);

    }
}
