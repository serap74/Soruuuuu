package Java_Soru;

import java.util.Scanner;

public class Q05_MethodCreation05 { /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("47 de kucuk pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();

        fibonacciSayi(sayi);
    }

    public static void fibonacciSayi(int sayi) {

        int num1=0;
        int num2=1;
        int num3;
        System.out.print(num1 +"-");
        System.out.print(num2 +"-");

        if(sayi<47){
            for (int i = 2; i <sayi ; i++) {
               num3=num1+num2;
                System.out.print("-"+num3);

                num1=num2;
                num2=num3;
            }

        }else System.out.print("47 den kucuk bir sayi giriniz");


    }
}
