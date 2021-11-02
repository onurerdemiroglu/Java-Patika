class Course {
    String name;
    String code;
    String prefix;
    Teacher teacher;
    int examNote;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Akademisyen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacherInfo() {
        if (this.teacher != null) {
            System.out.println("Adı      :\t" + this.teacher.name);
            System.out.println("Soyadı   :\t" + this.teacher.surname);
            System.out.println("Telefon  :\t" + this.teacher.mpno);
            System.out.println("Bölüm    :\t" + this.teacher.branch);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
