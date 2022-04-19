package Java_Soru;

import java.util.Scanner;

public class Q12_IfStatement03 {


    	/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

    public static void main(String[] args) {
       //1.yol

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitle=scan.nextLine().toLowerCase();

        if(jobTitle.equals("qa")){
            System.out.println("İs unvaniniz Quality Analyst");

        }else if(jobTitle.equals("dev")){
            System.out.println("İs unvaniniz Developer");

        }else if(jobTitle.equals("ba")){
            System.out.println("İs unvaniniz Business Analyst");


        }else if(jobTitle.equals("pm")){
            System.out.println("İs unvaniniz Project Manager ");

        }

        //2.yol

        switch(jobTitle){

            case "qa":
                System.out.println("İs unvaniniz Quality Analyst");
                break;
            case "dev":
                System.out.println("İs unvaniniz Developer");
                break;
            case "ba":
                System.out.println("İs unvaniniz Business Analyst");
                break;
            case "pm":
                System.out.println("İs unvaniniz Project Manager");
                break;
            default:
                System.out.println("is unvaninizi bir jobtitle giriniz");
                break;
        }

        scan.close();

    }
}
