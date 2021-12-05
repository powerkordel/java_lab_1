import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte nowaByte = 9;
        System.out.println("zmienna typu byte: " + nowaByte );
        short nowaShort = -273;
        System.out.println( "zmienna typu short: " + nowaShort);
        int nowaInt = 10;
        System.out.println( "zmienna typu int: " + nowaInt);
        double nowaDouble = 4.0;
        System.out.println( "zmienna typu double: " + nowaDouble);
        float newFloat = 40.678696f;
        System.out.println( "zmienna typu float: " + newFloat);
        long nowaLong = 748749747447832423L;
        System.out.println( "zmienna typu long: " + nowaLong);
        boolean zmiennaBool = true;
        System.out.println( "zmienna typu boolean: " + zmiennaBool);
        char nowaChar = 'P';
        System.out.println( "zmienna typu char: " + nowaChar);
        String nowaString = "Stringi";
        System.out.println("zmienna typu string: " + nowaString);


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        int a = 12;
        int b = 7;

        int dodawanieWynik = a + b;
        int odejmowanieWynik = a - b;
        int mnozenieWynik = a * b;
        int dzielenieWynik = a / b;
        int moduloWynik = a % b;
        System.out.println(dodawanieWynik);
        System.out.println(odejmowanieWynik);
        System.out.println(mnozenieWynik);
        System.out.println(dzielenieWynik);
        System.out.println(moduloWynik);

        double x = 22.2;
        double y = 4.2;
        double dodawanieWynikD = x + y;
        double odejmowanieWynikD = x - y;
        double mnozenieWynikD = x * y;
        double dzielenieWynikD = x / y;
        double moduloWynikD = x % y;
        System.out.println(dodawanieWynikD);
        System.out.println(odejmowanieWynikD);
        System.out.println(mnozenieWynikD);
        System.out.println(dzielenieWynikD);
        System.out.println(moduloWynikD);


    }
}
