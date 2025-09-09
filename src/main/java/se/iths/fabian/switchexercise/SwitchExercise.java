package se.iths.fabian.switchexercise;

public class SwitchExercise {
    public static void main(String[] args) {
        int hour = 7;
        switch (hour) {
            case 1:
                System.out.println("13:00");
                break;
            case 2:
                System.out.println("14:00");
                break;
            case 3:
                System.out.println("15:00");
                break;
            case 4:
                System.out.println("16:00");
                break;
            case 5:
                System.out.println("17:00");
                break;
            case 6:
                System.out.println("18:00");
                break;
            default:
                System.out.println("Ogiltig timme.");
                break;
        }
    }
}
