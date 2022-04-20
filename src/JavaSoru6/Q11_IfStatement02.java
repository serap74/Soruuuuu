package JavaSoru6;

public class Q11_IfStatement02 {

    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

    public static void main(String[] args) {

        int grade=85;

        if(grade>=90 && grade<=100){
            System.out.println("Notunuz A , Tebrikler");

        }else if(grade<90 && grade>=80){
            System.out.println("Notunuz B , guzel not");

        }else if(grade<80 && grade>=70){
            System.out.println("Notunuz C , iyi not");

        }else if(grade<70 && grade>=60){
            System.out.println("Notunuz D , Gecer not uzulme" );

        }else System.out.println("Notunuz F , Bu not gecmez, kaldiniz");
    }
}
