package Java_Soru5;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {

     /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."

		 whileLoop,DoWhile Kullanıcıdan bir kelime girmesini isteyin.
		 Sözcük tek sayıda karaktere sahipse ve 3 veya daha fazla karaktere sahipse,
		 sözcüğü sözcüğün ortasına yazdırın. kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String yazi="";


        do {
            System.out.println("Bir String giriniz");
           yazi=scan.nextLine();
            if(yazi.length()<3){
                System.out.println("string 3 karakterden az");

            }
            if(yazi.length()%2==1 && yazi.length()>=3){
                System.out.println("Stringin ortasindaki karakter : " + yazi.charAt(yazi.length()/2));

            }else System.out.println("Stringdrki karakter sayisi cift");

        }while(!(yazi.length()%2==1 && yazi.length()>=3));
    }
}
