import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        System.out.println();
        boolean t = true;
        boolean f = false;
        boolean t2 = true;
        System.out.println("Przyklady uzycia operatorow arytmetycznych:" + "\n t = true \tf = false\tt2 = true");
        System.out.println();
        System.out.println("(Przyklad kiedy false) : " + (f && t2));
        System.out.println("(Przyklad kiedy true) : " + (t && t2));
        System.out.println("To bedzie true : " + (t || t2));
        System.out.println("To bedzie false : " + (false || f));
        System.out.println("To bedzie true : " + !f);
        System.out.println("To bedzie false : " + !t);
        System.out.println("To bedzie  false: " + (f && !t2));
        System.out.println("To bedzie false : " + !((f && !t) || (t || f)));
        System.out.println();
        int a = 10;
        int b = 9;
        int c = 5;
        System.out.printf("Operacje logiczne na liczbach:" + "\na = %d\tb = %d\tc = %d\n", a, b, c);
        System.out.println();
        System.out.println("a jest rowne b (false) : " + (a == b));
        System.out.println("c + c jest rowne a (true) : " +  (a == (c+c)));
        System.out.println("c nie jest rowne a (true) : " + (c != a));
        System.out.println("c nie jest rowne c (false) : " + (c != c));
        System.out.println("b jest mniejsze od a (true) : " + (a > (c+1)));
        System.out.println("a jest mniejsze od b (false) : " + (a < b));
        System.out.println("b jest wieksze, lub rowne c (true) : " + (b >= c));
        System.out.println("To bedzie true : " + ((a > b) || (t && f) && (false || t) &&(a==(b+1))));
        System.out.println("to bedzie false : " + !((b<c) || (!t && f) && !(f || !t2) || (!(!f&& !t2))));


    }
}
