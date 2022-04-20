package Java_Soru2;

import java.util.Arrays;
import java.util.Scanner;

public class C01Q_StringKarakter {
    public static void main(String[] args) {
/*
     Kullanicidan bir String aliniz.
     scanner            sout

     String'de var olan her character'in sayisini ekrana yazdiriniz.




     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
            [a,b,a,a]=split ile yapiyoruz
            [a,a,a,b]=sort
                 interwiev sorusu


    */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen string giriniz");
        String str = scan.nextLine();

        //split

        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        //sıralama sort

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //sayac olusturalım

        int sayac = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                sayac++;

            } else {
                System.out.println(arr[i-1] + " sayisi" + (sayac+1));
                sayac=0;
            }

            if(i==arr.length-1) {//en sona geldidinde
                System.out.println(arr[i] + "sayisi " + (sayac+1));
            }
        }
    }}
