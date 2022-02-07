import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi oluşturuyoruz.
        double a,b,c;


        //Kullanıcıdan verilerimizi alıyoruz.
        Scanner girdi=new Scanner(System.in);



        /*Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.*/

        System.out.println("1.kenarı giriniz: ");
        a=girdi.nextDouble();
        System.out.println("2.kenarı giriniz: ");
        b=girdi.nextDouble();
        System.out.println("3.kenarı giriniz: ");
        c=girdi.nextDouble();

        double alan,cevre;
        cevre=(a+b+c)/2;
        System.out.println("Üçgenin çevresi :"+cevre);
        alan=cevre*(cevre-a)*(cevre-b)*(cevre-c);
        System.out.println("Üçgenin Alanı: "+alan);
    }
}
