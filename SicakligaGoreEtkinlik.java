package com.example.Java101;
import java.util.Scanner;
/*
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
public class SicakligaGoreEtkinlik {
    public static void main(String[] args){
        int heat;
        Scanner x=new Scanner(System.in);
        System.out.print("Hava kaç derece?: ");
        heat=x.nextInt();
        if(heat<5){
            System.out.print("Kayak yapmalıyız.");
        }
        else if(heat>=5&&heat<15){
            System.out.println("Sinemaya gitmeliyiz.");
        }
        else if(heat>=15&&heat<25){
            System.out.println("Pikniğe gitmeliyiz.");
        }
        else{
            System.out.println("Hava çok sıcak. Yüzmeye gitmeliyiz.");
        }
    }
}
