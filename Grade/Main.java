public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher
                ("Saul","TRH","90500481231");
            Teacher t2 = new Teacher("Walter", "CHM", "000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);


        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4.", tarih,fizik,biyo);
        s1.addBulkExamNote(100,55,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();
     }
}
