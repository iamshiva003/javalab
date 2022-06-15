import java.util.Scanner;

class StringMethods 
{
    public static void main(String[] args) 
    {      

       Scanner scan = new Scanner(System.in);
        String str = new String("Shivakumar Patl");

        // System.out.print("Ente the String: ");
        // str = scan.nextLine();

        char c = str.charAt(0);
        System.out.println(c);

        int pos = str.indexOf('i');
        System.out.println("Position of the letter i is                              : " + pos);
        System.out.println();

        int len = str.length();
        System.out.println("Length of the String is                                  : " + len);
        System.out.println();

        boolean b = str.isEmpty();
        System.out.println("String is Empty or not?!                                 : " + b);
        System.out.println();

        String s2 = str.toLowerCase();
        System.out.println("Lower Case of the string is                              : " + s2);
        System.out.println();

        String su = str.toUpperCase();
        System.out.println("Lower Case of the string is                              : " + su);
        System.out.println();

        boolean contain = str.contains("Patil");
        System.out.println("String contains the given string or not                  : " + contain);
        System.out.println();

        boolean eq = str.equals("Shivakumar Patil");
        System.out.println("Checking if two strings are equal or not                 : " + eq);
        System.out.println();

        boolean eqig = str.equalsIgnoreCase("shivakumar patil");
        System.out.println("Checking if two strings are equal with ignoring the case : " + eqig);
        System.out.println();

        String sub = str.substring(4, 10);
        System.out.println("Sub String generated is                                  : " + sub);
        System.out.println();

        String rep = str.replace('i', 'z');
        System.out.println("String after replacing letter is                         : " + rep);
        System.out.println();

        String con = str.concat(" is a good student");
        System.out.println("After Concatinating                                      : " + con);
        System.out.println();

        String[] sp = str.split("\\s");
        System.out.println("String After Splitting is                                : ");
        for(String s:sp)
            System.out.println(s);
        System.out.println();

     }
}
