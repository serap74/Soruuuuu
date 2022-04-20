package JavaSoru6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {

    /*
     * Kullanicidan int  list uzunlugunu isteyin
     * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
     * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
     *
     * n = 5 icin (listin uzunlugu);
     * input { 1 , 2 , 2 , 3 , 4}
     * output {2}
     *
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("List uzunlugu giriniz");
        int uzunluk=scan.nextInt();
        List<Integer> list=new ArrayList<>();
        System.out.println("Girdiginiz list uzunlugu kadar eleman ekleyiniz");

        for (int i = 0; i <uzunluk ; i++) {
            list.add(scan.nextInt());


        }
        tekrarliElemanList(list);

    }

    private static void tekrarliElemanList(List<Integer> list) {
        List<Integer>tekrarliList=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size() ; j++) {

                if(list.get(i) == list.get(j)&& tekrarliList.contains(list.get(i))){
                    tekrarliList.add(list.get(i));
                }

            }

        }
        System.out.println("tekrarli listenin elemanlari: " + tekrarliList);
    }


}
