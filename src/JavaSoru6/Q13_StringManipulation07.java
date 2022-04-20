package Java_Soru;

public class Q13_StringManipulation07 {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {



        String str = "kkkk" ;
        xyzMetod(str);



    }

    private static void xyzMetod(String str) {
        boolean xyzIceriyorMu=false;
        if(str.contains("xyz")){
            xyzIceriyorMu=true;
            System.out.println("true");
        }else{
            xyzIceriyorMu=false;
            System.out.println("false");
        }


    }


}
