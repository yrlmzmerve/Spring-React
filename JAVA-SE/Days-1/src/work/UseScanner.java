package work;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {

        // Scanner : kullanıcıdan veri almayı sağlar
        // Verileri consoldan alır

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println(sum);

        // Kullanıcının adı ve soy adını alan program yazma

        // yukarıdaki scanneri kullanamadık hata verdi
        // scanner çalışma doğasıyla alakalı
        // yukarı da int olarak çalıştı
        // bir değişkenden başka bir değişken almaya geçileceği zaman boş bir
        // int ten stringe geçerken hata veriyor,
        // stringden inte geçerken hata vermez
        // scanner.nextLine() yazılırsa hata yapmadan çalışır

        scanner.nextLine();

        System.out.println("Enter name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter surname: ");
        String userSurname = scanner.nextLine();
        System.out.println("User NAME : "+ userName+" "+userSurname);



    }
}
