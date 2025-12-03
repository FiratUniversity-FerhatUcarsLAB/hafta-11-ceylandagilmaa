public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // TODO
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // TODO
    }

    public static void main(String[] args) {
        // TODO: test methods
    }
}public class DatePrinter {

    // American format: Day, Month DayNumber, Year
    public static void printAmerican(String day, String month, int dayNumber, int year) {
        System.out.println(day + ", " + month + " " + dayNumber + ", " + year);
    }

    // European format: Day DayNumber Month Year
    public static void printEuropean(String day, int dayNumber, String month, int year) {
        System.out.println(day + " " + dayNumber + " " + month + " " + year);
    }

    public static void main(String[] args) {

        String day = "Monday";
        String month = "January";
        int dayNumber = 15;
        int year = 2025;

        printAmerican(day, month, dayNumber, year);
        printEuropean(day, dayNumber, month, year);
    }
}
