package StudentGradingSystem;

public class Student {

    String name, stuNo;
    int     classes;
    Course  mat;
    Course  fizik;
    Course  kimya;
    double  avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name    = name;
        this.classes = classes;
        this.stuNo   = stuNo;
        this.mat     = mat;
        this.fizik   = fizik;
        this.kimya   = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addOralBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.oralExamNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.oralExamNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.oralExamNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
            System.exit(0);
        } else if (this.mat.oralExamNote == 0 || this.fizik.oralExamNote == 0 || this.kimya.oralExamNote == 0) {
            System.out.println("Sözlüler tam olarak girilmemiş");
            System.exit(0);
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizik, kimya, mat;

        fizik = ((this.fizik.note * this.fizik.exam) + (this.fizik.oralExamNote * this.fizik.oralExam));
        kimya = ((this.kimya.note * this.kimya.exam) + (this.kimya.oralExamNote * this.kimya.oralExam));
        mat   = ((this.mat.note * this.mat.exam) + (this.mat.oralExamNote * this.mat.oralExam));

        this.avarage = (fizik + kimya + mat) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
