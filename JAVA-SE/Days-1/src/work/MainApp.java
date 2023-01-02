package work;

public class MainApp {
    public static void main(String[] args) {

         // Değişkenler
        // String --> Defult değeri : null

        String name ="James";
        String surname="Gosling";

        String st1 ="123";
        String st2 ="456";
        System.out.println( st1+st2 );
        // Output : 123456


        //Soru 1: Alttaki 2 kod satırı çalıştığında, bellekte kaç değişken tutulur?
        String city ="Ankara";
        String capital ="Ankara";

        // Cevap : Referans type nedeniyle burada 1 tane değişken vardır
        // Bellekte aynı değere sahip olan değişkenler, değişkene referans type sayesinde ulaşım sağlarlar.
        // javaya özgü davranıstır


        // int
        int age = 25;
        int year = 2022;
        int birthdayYear = year - age;
        System.out.println(birthdayYear);

        // int : 32 bits - long : 64 bits
        // long

        long bigCount = 9512684732476l;
        // sonuna l yazılır
        // herşeyi long yaparsak gereksiz yere yer kaplar

        // Byte - (127) (-128) aralığında değer alır
        byte userClass = 127;
        // 128 yapılmaz hata verir

        // short
        // Defult - 0
        short area = 32000;



        // Ondalıklı Sayı Değerleri
        // java ondalıklı sayıyı default olarak double algılar

        // double - // 8 bytes
        // Defult - 0.0
        // javada defult ondalıklı değerdir.
        // max 15 basamaklı ondalıklı değerler saklamak için kullanılır.

        double d1 = 123456782.51231231231231;

        double ondalik1 = 40.5;
        double ondalik2 = 55.2;
        System.out.println("Double toplama sonuc:" + ondalik1+ondalik2 );
        // output : Double toplama sonuc:40.555.2
        System.out.println("Double toplama sonuc:" + (ondalik1+ondalik2) );
        // output: Double toplama sonuc:95.7

        double ondalikSum = ondalik1+ondalik2;
        System.out.println("Double toplama sonuc:" + (ondalikSum) );

        // float - // 4 bytes - Defult - 0.0
        float f1 = 12.5f; // sonuna f eklenir

        // boolean : True - False
        boolean flag = false;
        flag = true;


        // char - tek harf alır , tek tırnakla tanımlanır
        char c = 'j';



    }
}
