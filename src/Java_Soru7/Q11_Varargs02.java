package Java_Soru7;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)
    //Çift varargs ile bir çarpma yöntemi oluşturun (çift dönüş)
    public static void main(String[] args) {

        System.out.println(carpma(1.2,2.3,3.4,4.5,5.6));

    }

    public static double carpma(double... numbers){
        int carpim=1;
        for (int i = 0; i <numbers.length ; i++) {
            carpim*=numbers[i];
        }



        return carpim;
    }
}
