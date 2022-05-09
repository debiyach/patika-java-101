package StudentGradingSystem;

public class Course {

    Teacher courseTeacher;
    String  name;
    String  code;
    String  prefix;
    int     note;
    int     oralExamNote;
    float   oralExam;
    float   exam;

    public Course(String name, String code, String prefix) {
        this.addConstructData(name, code, prefix);
        this.oralExam = 0.20F;
        this.exam     = 0.80F;
    }

    public Course(String name, String code, String prefix, float oralExam, float exam) {
        this.addConstructData(name, code, prefix);
        if ((oralExam + exam) == 1) {
            this.oralExam = oralExam;
            this.exam     = exam;
        } else {
            System.out.println("Sözlü ve sınav yüzdelik toplamı \"1\" olmalıdır!");
            System.exit(0);
        }
    }

    void addConstructData(String name, String code, String prefix) {
        this.name         = name;
        this.code         = code;
        this.prefix       = prefix;
        this.note         = 0;
        this.oralExamNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

}
