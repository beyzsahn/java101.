package com.example.Java101.ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args){
        Teacher t1=new Teacher("Mahmut", "TRH", "+555");
        Teacher t2=new Teacher("Graham","FZK", "+444");
        Teacher t3=new Teacher("KülYutmaz","BIO", "+111");

        Course tarih=new Course("Tarih","101","TRH",t1,20);
        tarih.addTeacher(t1);
        tarih.note=90;
        Course fizik=new Course("Fizik","101","TRH",t2,30);
        fizik.addTeacher(t2);
        fizik.note=60;
        Course biyo=new Course("Biyoloji","101","BIO",t3,15);
        biyo.addTeacher(t3);
        biyo.note=70;


        //Student s1=new Student("İnek Şaban","123", "4",tarih,fizik,biyo);
        //s1.addBulkExamNote(100,200,50);
        //s1.isPass();
        tarih.printTeacherInfo();
        fizik.printTeacherInfo();
        biyo.printTeacherInfo();
    }
}
