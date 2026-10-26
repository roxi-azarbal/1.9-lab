public class UnitPracticeTester {
    public static void main(String[] args) {
        UnitPractice up = new UnitPractice();

        // Each line prints the call, then the result. Add two calls for
        // every other method: one normal input and one boundary input.
        System.out.println("alarmClock(1, false): " + up.alarmClock(1, false));
        System.out.println("alarmClock(0, true): " + up.alarmClock(0, true));
        System.out.println("doubleChar(\"The\"): " + up.doubleChar("The"));
        System.out.println("doubleChar(\"\"): " + up.doubleChar(""));
    }
}