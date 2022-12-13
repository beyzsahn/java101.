import java.util.Scanner;
public class NotOrt {
    public static void main(String[] args) {
        int mat,fzk,kmy,turkce,trh,muzik;
        Scanner a = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = a.nextInt();

        System.out.print("Fizik Notunuz: ");
        fzk = a.nextInt();

        System.out.print("Kimya Notunuz: ");
        kmy = a.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = a.nextInt();

        System.out.print("Tarih Notunuz: ");
        trh = a.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = a.nextInt();

        int toplam = (mat+fzk+kmy+turkce+trh+muzik);
        double sonuc = (toplam/6);

        System.out.println("Ortalamanız: " + sonuc);

        boolean yanit = sonuc >= 60;
        String str = yanit ? "Sınıfı geçtin." : "Sınıfta kaldın.";
        System.out.println(str);


    }
}
