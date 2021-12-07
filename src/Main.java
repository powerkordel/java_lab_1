import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        int wiek = 40;

        if (wiek%3==0) {
            System.out.println("Wiek podzielny przez 3");
        }else{
            System.out.println("Wiek nie podzielny przez 3");
        }
        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println();
        int index = 20407;
        int sprawdzam = (index%2==0)?0:1;
        System.out.println("Jesli parzysty to 0, jesli nie parzysty to 1 - mój index to: " + sprawdzam);
        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println();

        Scanner wpisz = new Scanner(System.in);

        System.out.println("Wpisz dowolny rok: ");

        int rok = wpisz.nextInt();

        if (((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0) ){
            System.out.printf("Rok %d jest przestepny\n", rok);
        } else{
            System.out.printf("Rok %d nie jest przestepny\n", rok);
        }
        System.out.println();

        System.out.println("Podaj liczbę a: ");

        double a = wpisz.nextInt();

        System.out.println("Podaj liczbę b: ");
        double b = wpisz.nextDouble();

        double wynik = (a/b);


        if (wynik >= 0  ) {System.out.println("Wynik nie jest ujemny i wynosi :" + wynik); }
        else {
            System.out.println("Wynik jest ujemny i wynosi " + wynik);
        }



    }
}
