import java.time.LocalDateTime;

public class Employee {
    String name; //Çalışanın adı soyadı
    double salary; //Çalışanın maaşı
    int workHours; // Haftalık çalışma saati
    int hireYear; //İşe başlangıç  yılı
    int workingYear;
    double tax = 0.0;
    double bonus = 0.0;
    double raise = 0.0;

    Employee(String name, int salary, int workHours, int hireYear) {  //Kurucu method
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear; //başlangıç yılı new Date(2009, Calendar.FEBRUARY, 1);
    }

    void tax() { //Maaşa uygulanan vergi
        if (this.salary < 1000) {
            this.tax = 0.0;
        }
        if (this.salary >= 1000) {
            this.tax = this.salary * 0.03;
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
    }

    void raiseSalary() {
        this.workingYear = LocalDateTime.now().getYear() - this.hireYear;

        if (this.workingYear < 10) {
            this.raise = (int) (this.salary * 0.05);
        }
        if (this.workingYear > 9 && this.workingYear < 20) {
            this.raise = (int) (this.salary * 0.1);
        }
        if (this.workingYear > 19) {
            this.raise = (int) (this.salary * 0.15);
        }
    }

    String formatString(String format) {
        String indent = String.format("%-42s", "");
        return format + indent.substring(0, indent.length() - format.length()) + ":";
    }

    void printToString() {

        System.out.println(formatString("Adı") + this.name);
        System.out.println(formatString("Maaşı") + this.salary + " ₺");
        System.out.println(formatString("Çalışma Saati") + this.workHours);
        System.out.println(formatString("Başlangıç Yılı") + this.hireYear);
        System.out.println(formatString("Vergi") + this.tax + " ₺");
        System.out.println(formatString("Bonus") + this.bonus + " ₺");
        System.out.println(formatString("Maaş Artışı") + this.raise + " ₺");
        System.out.println(formatString("Vergi ve Bonuslar ile birlikte maaş") + (this.salary - this.tax + this.bonus) + " ₺");
        System.out.println(formatString("Toplam maaş") + (this.salary - this.tax + this.bonus + this.raise) + " ₺");
    }


}
