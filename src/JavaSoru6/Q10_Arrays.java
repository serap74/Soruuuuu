package Java_Soru;

public class Q10_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */

    public static void main(String[] args) {

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        str=str.replaceAll(" ","");
        String harf[]=str.split("");
        System.out.println(harf.length);
    }
}
