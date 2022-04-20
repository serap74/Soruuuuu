package Java_Soru;

public class Q08_Arrays {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */

    public static void main(String[] args) {

        String arr[][]={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr[i][j].contains("$")){
                    toplam+=Double.parseDouble((arr[i][j].replace("$","")));
                }else if(arr[i][j].contains("£")){
                    toplam+=Double.parseDouble((arr[i][j].replace("£","")));
                }

            }

        }
        System.out.println("Toplam = " + toplam);
    }
}
