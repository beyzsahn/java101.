package com.example.Java101.ogrenciBilgiSistemi;

/* Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

 */
public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    double oralPercentage;

    Course(String name,String code, String prefix, Teacher teacher, double oralPercentage){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
        this.oralPercentage=oralPercentage;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
           // System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
        //System.out.println("Sözlünün etkisi: "+this.oralPercentage+"%");
        double oralContribution = calculateOralContribution(this.note);
        System.out.println("Sözlü Notunun Ortalamaya Etkisi: " + oralContribution);

    }
    double calculateOralContribution(int oralNote) {
        return oralNote * (oralPercentage / 100.0);

    }


}
