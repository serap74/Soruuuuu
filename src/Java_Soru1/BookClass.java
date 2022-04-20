package Java_Soru1;

public class BookClass {

    String adi, yazari;
    int yayinYili;

    public BookClass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;
    }

    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;

    }
    public void display(){
        System.out.println("Kitap:" +adi + " Yazar :" +yazari + " yayin yili:" +yayinYili);
    }

    public static void main(String[] args) {
        BookClass kitap1=new BookClass("Harry Potter","JK",2000);
        BookClass kitap2=new BookClass("Sefiller","Victor Hugo",1976);

        kitap1.display();
        kitap2.display();

    }
}
