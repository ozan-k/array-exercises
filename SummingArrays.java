import java.util.Arrays;

public class SummingArrays {
    public static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers){
            result += number;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        System.out.println("Summing up " + Arrays.toString(numbers) + " = " + sum(numbers));

        numbers = new int[] {10, 20, 30, 40};
        System.out.println("Summing up " + Arrays.toString(numbers) + " = " + sum(numbers));

        numbers = new int[] {0, -100, 30, 70};
        System.out.println("Summing up " + Arrays.toString(numbers) + " = " + sum(numbers));
    }
}