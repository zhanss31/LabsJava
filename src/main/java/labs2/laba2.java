package labs2;

import java.util.Scanner;
public class laba2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str= in.nextLine();
        Line ln= new Line(str);
        System.out.println(ln.lineWithAmount());
        System.out.println();
        System.out.println(ln.lineWithoutRepetitions());
    }
}
