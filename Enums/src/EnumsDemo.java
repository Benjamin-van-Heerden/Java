public class EnumsDemo {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        Day d1 = Day.MONDAY;

        System.out.println("Red Enum name: " + c1.name());
        System.out.println("Red Enum value: " + c1.getValue());

        for (Day day: Day.values()) {
            System.out.println("Day: " + day.name());
        }
    }
}
