public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13);
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }
}
public class DatePrinter {

    // American format: Month Day, Year
    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // European format: Day Date Month Year
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {

        // Test verileri
        String day = "Monday";
        String month = "January";
        int date = 15;
        int year = 2025;

        // Metotları test et
        System.out.println("American Format:");
        printAmerican(day, month, date, year);

        System.out.println("European Format:");
        printEuropean(day, date, month, year);
    }
}
