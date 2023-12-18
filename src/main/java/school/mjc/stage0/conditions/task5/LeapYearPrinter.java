package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String result = year % 4 == 0 ? "leap" : "not leap";
        result = result == "leap" && year % 400 != 0 ? "not leap": result;
        System.out.println(result);
    }
}
