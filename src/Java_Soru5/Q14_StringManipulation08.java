package Java_Soru5;

import java.util.Scanner;

public class Q14_StringManipulation08 {

     /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("name 1 girin");
         String name1 = scanner.next();

         System.out.println("name 2 girin");
         String name2 = scanner.next();

         if (name1.length() % 2 == 0) {
             System.out.println(name1.substring(0,(name1.length()/2)).concat(name2).concat(name1.substring(name1.length()/2)));


         }else System.out.println("isim1 cift sayili olmadigi icin ortasina yerlestiremedik");
     }}