package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        String result;
        switch (number) {
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):
                result = "number is between 1 and 5";
                break;
            case (6):
            case (7):
            case (8):
            case (9):
            case (10):
                result = "number is between 6 and 10";
                break;
            default:
                result = "out of range";
        }
        System.out.println(result);
    }
}
