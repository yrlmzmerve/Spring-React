package work;

public class UseIF {
    public static void main(String[] args) {
        int num = 22;
        int num2 = 35;
        boolean status = num > num2;
        status = num < num2 && num > 5;
        status = num > num2 || num > 5;

        if(status){
            System.out.println("Koşul Sağlanır");
        }else{
            System.out.println("Koşul Sağlanmıyor");
        }

    }
}
