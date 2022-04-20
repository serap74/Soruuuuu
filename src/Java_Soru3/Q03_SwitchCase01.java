package Java_Soru3;

public class Q03_SwitchCase01 {

    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

    public static void main(String[] args) {

        String gun="Sali";

        switch (gun){
            case "pazartesi":
            case "sali":
                System.out.println("Java Class");
                break;

            case "carsamba":
            case "persembe":
                System.out.println("SQL");
                break;
            case "cuma":
            case "cumartesi":
                System.out.println("Selenyum");
                break;

            default:
                System.out.println("izin gunu");
        }
    }
}
