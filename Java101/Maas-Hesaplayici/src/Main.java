public class Main {
    public static void main(String[] args) {
        Employee member = new Employee("Onur", 2000, 45, 1985);
        member.tax();
        member.bonus();
        member.raiseSalary();
        member.printToString();
    }
}
