package Java_Soru;

public class Q06_NestedIfandTernary {

    /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
    public static void main(String[] args) {

        int sayi = 9;
        String sonuc = "";
        if (sayi >= 0 && sayi <= 9) {


            if (sayi == 9)
                sonuc = "dokuz";

            else if (sayi == 8)
                sonuc = "sekiz";

            else if (sayi == 7)
                sonuc = "seven";

            else if (sayi == 6)
                sonuc = "alti";

            else if (sayi == 5)
                sonuc = "bes";

            else if (sayi == 4)
                sonuc = "dort";

            else if (sayi == 3)
                sonuc = "uc";

            else if (sayi == 2)
                sonuc = "iki";

            else if (sayi == 1)
                sonuc = "bir";

            else
                sonuc = "sifir";


        } else {
        sonuc="Invalid";
        }
        System.out.println("sonuc" + sonuc);

        //Ternary
        int s=4;

        String sonuc2= s==9?"dokuz":
                        s==8?"sekiz":
                        s==7?"yedi":
                        s==6?"alti":
                        s==5?"bes":
                        s==4?"dort":
                        s==3?"uc":
                        s==2?"iki":
                        s==1?"bir":
                         s==0?"sıfır":"Invalid";

        System.out.println(sonuc2);
    }

}