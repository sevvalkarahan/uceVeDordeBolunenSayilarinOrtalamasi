import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=input.nextInt();
        int total = 0;
        int sayac=0;
        for (int i = 0; i <a ; i++) {
            if (i%3==0 && i%4==0) {
                System.out.print(i + " ");
                sayac++;
                total+=i;
            }
        }
        System.out.println(" ");
        System.out.println("Sayıların toplamı: "+total);
        double ort=total/(sayac-1);
        System.out.println("Sayıların ortalaması: "+ort);

    }
}
