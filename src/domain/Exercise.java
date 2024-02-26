package domain;

public class Exercise {
    public static int Calculate(int day, int month, int year){
        int sum = day + month + year;
        while (sum > 9) {
            sum = sum / 10 + sum % 10;
        }
        return sum;
    }
}
