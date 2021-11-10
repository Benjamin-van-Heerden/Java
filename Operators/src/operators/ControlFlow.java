package operators;

public class ControlFlow {
    public static void main(String[] args) {
        int score = 90;
        String grade;

        if (score == 100) {
            grade = "Full Marks";
        }
        else if (score > 50) {
            if (score < 60) {
                grade = "D";
            }
            else if (score >= 60 && score < 80) {
                grade = "B";
            }
            else {
                grade = "A";
            }
        }
        else {
            grade = "Fail";
        }
        System.out.println(grade);

        int a = 1;
        int b = 2;
        int anotherScore = 42;
        int result = anotherScore < 69 ? a : b;
        System.out.println(result);

        int month = 4;
        String strMonth;

        switch (month) {
            case 1:
                strMonth = "Jan";
                break;
            case 2:
                strMonth = "Feb";
                break;
            default:
                strMonth = "Not Jan or Feb";
                break;
        }
        System.out.println(strMonth);

    }
}
