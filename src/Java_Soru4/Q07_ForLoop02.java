package Java_Soru4;

public class Q07_ForLoop02 {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {

        int i=0;
        while(i<255){
            char c =(char) i;
            System.out.println(i + " - " +c);
            i++;
        }
    }
}
