package Java_Soru9;

public class Q06 {
    /*
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan buyuk olanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;

        for (int each : arr) {
            toplam+=each;

        }
        double ortalama=toplam/arr.length;
        System.out.println("Ortalama : " + ortalama);

        for (int each:arr) {
            if(each>ortalama){
                System.out.println("Ortalamadan buyuk olanlar : " + each);
            }

        }
        }
    }
