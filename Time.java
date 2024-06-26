public class Time {
    public static void main(String[] args) {
        System.out.println("local date : "+java.time.LocalDate.now());

        System.out.println("local time "+java.time.LocalTime.now());

        System.out.println("curr date and time "+java.time.LocalDateTime.now());
    }
}
