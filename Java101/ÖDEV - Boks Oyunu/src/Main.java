public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Manny Pacquiao", 15, 100, 66, 56);
        Fighter f2 = new Fighter("Floyd Mayweather", 11, 120, 68, 63);

        Match match = new Match(f1, f2, 60, 70);
        match.run();
    }
}
