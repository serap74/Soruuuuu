package JavaSoru6;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

    /* Interview Question

		Bir dizeyi tersine çevirmek için bir Java programı yazın. For döngüsü kullanın ve reverseString adlı bir yöntem oluşturun
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str=scan.nextLine();
        System.out.println("String ifadenin tersi : ");

        tersString(str);


    }

    private static String  tersString(String str) {
        String reversed="";


        for (int i =str.length()-1; i <0 ; i++) {
            reversed+=str.charAt(i);



        }
        return reversed;
    }
}
