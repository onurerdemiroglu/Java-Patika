public class Main {
    public static void main(String[] args) {
        Teacher teach = new Teacher("Onur", "ERDEMIROGLU", "+90 537 *** ** **", "MTH");
        Teacher teach2 = new Teacher("Mustafa", "GU***", "+90 535 *** ** **", "PHY");
        Teacher teach3 = new Teacher("Taha", "DU***", "+90 542 *** ** **", "CHL");

        Course math = new Course("Matematik", "101", "MTH");
        math.addTeacher(teach);

        Course physical = new Course("Fizik", "201", "PHY");
        physical.addTeacher(teach2);

        Course chemical = new Course("Kimya", "301", "CHL");
        chemical.addTeacher(teach3);

        Student stu = new Student("Onur", "170205101", "1", math, physical, chemical);
        stu.addBulkExamNotes(100, 90, 95);
        stu.addBulkVerbalNotes(80, 60, 75);
        stu.isPass();

        Student stu2 = new Student("Mustafa", "12947264", "2", math, physical, chemical);
        stu2.addBulkExamNotes(40, 45, 60);
        stu2.addBulkVerbalNotes(80, 70, 90);
        stu2.isPass();

        Student stu3 = new Student("Taha", "12649775", "3", math, physical, chemical);
        stu3.addBulkExamNotes(40, 35, 70);
        stu3.addBulkVerbalNotes(70, 85, 80);
        stu3.isPass();
    }
}
