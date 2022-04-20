package Java_Soru1;

public class ObjectClass {

    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */

    public static void main(String[] args) {
        OgretmenBilgileri obj1=new OgretmenBilgileri();
        obj1.isim="Ece";
        obj1.soyİsim="Kum";
        obj1.brans="Fizik";
        obj1.tel="5647389";
        obj1.yas=33;
        System.out.println(obj1);//referans degerlerini verir

        System.out.println(obj1.isim +" "+obj1.soyİsim+", "+obj1.yas +", "+obj1.brans+", "+obj1.tel);
    }
}
