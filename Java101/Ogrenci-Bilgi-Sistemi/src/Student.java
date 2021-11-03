import java.text.DecimalFormat;

public class Student {
    Course math;
    Course physical;
    Course chemical;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course math, Course physical, Course chemical) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physical = physical;
        this.chemical = chemical;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNotes(int mathExamNote, int physicalExamNote, int chemicalExamNote) {
        if (mathExamNote >= 0 && mathExamNote <= 100) {
            this.math.examNote = mathExamNote;
        }
        if (physicalExamNote >= 0 && physicalExamNote <= 100) {
            this.physical.examNote = physicalExamNote;
        }
        if (chemicalExamNote >= 0 && chemicalExamNote <= 100) {
            this.chemical.examNote = chemicalExamNote;
        }
    }

    void addBulkVerbalNotes(int mathVerbNote, int physicalVerbNote, int chemicalVerbNote) {
        if (mathVerbNote >= 0 && mathVerbNote <= 100) {
            this.math.verbalNote = mathVerbNote;
        }
        if (physicalVerbNote >= 0 && physicalVerbNote <= 100) {
            this.physical.verbalNote = physicalVerbNote;
        }
        if (chemicalVerbNote >= 0 && chemicalVerbNote <= 100) {
            this.chemical.verbalNote = chemicalVerbNote;
        }
    }

    void isPass() {
        System.out.println("==============");
        calcAverage();
        printNote();

        if (this.average > 55) {
            System.out.println("\n" + this.name + ", tebrikler! Sınıfı başarılı bir şekilde geçtin.\uD83D\uDC4F");
            this.isPass = true;
        } else {
            System.out.println("\n" + this.name + ", üzgünüz ki sınıfı geçemedin!\uD83D\uDE2D");
            this.isPass = false;
        }
    }

    void calcAverage() {
        this.average = ((this.math.examNote * 0.8 + this.math.verbalNote * 0.2) +
                (this.physical.examNote * 0.8 + this.physical.verbalNote * 0.2) +
                (this.chemical.examNote * 0.8 + this.chemical.verbalNote * 0.2)) / 3.0;

    }

    void printNote() {
        System.out.println(this.math.name + " Notu : " + (this.math.examNote * 0.8 + this.math.verbalNote * 0.2));
        System.out.println(this.physical.name + " Notu     : " + (this.physical.examNote * 0.8 + this.physical.verbalNote * 0.2));
        System.out.println(this.chemical.name + " Notu     : " + (this.chemical.examNote * 0.8 + this.chemical.verbalNote * 0.2));
        System.out.println("Ortalaması     : " + new DecimalFormat().format(this.average));
    }
}
