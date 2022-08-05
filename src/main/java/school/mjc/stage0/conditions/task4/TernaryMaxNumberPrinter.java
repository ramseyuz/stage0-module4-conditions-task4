package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int f;
        f = Math.max(first, Math.max(second, third));
        System.out.println(f);
    }
}
