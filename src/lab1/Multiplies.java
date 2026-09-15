package lab1;

public class Multiplies {
    public static void main(String[] args){
        System.out.println(CountMultiplies());
    }

    private static int CountMultiplies() {
        int count = 0;
        for (int i = 1; i < 1000; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 || divisibleBy5){
                count++;
            }
        }
        return count;
    }
}
