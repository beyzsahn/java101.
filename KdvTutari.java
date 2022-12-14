import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        double tutar;
        double kdv1 = 0.18;
        double kdv2 = 0.08;
        double kdv;
        Scanner a = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz: ");
        tutar = a.nextDouble();

        double str = (1000>tutar && tutar>0) ? (kdv=kdv1) : (kdv=kdv2);

        double kdvTutar = tutar * kdv;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz tutar: " + tutar);
        System.out.println("Kdv oranı: " + kdv);
        System.out.println("Kdv tutarı: "+ kdvTutar);
        System.out.println("Kdv'li tutar: "+ kdvliTutar);




    }

}
