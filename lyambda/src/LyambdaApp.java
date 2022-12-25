public class LyambdaApp {
    public static void main(String[] args) {
        Expresiion f = (n) -> n%2 == 0;
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(num, f));
    }

    private static int sum(int[] numbers, Expresiion f) {
        int result = 0;
        for (int i : numbers) {
            if (f.isEqual(i))
                result += i;
        }
        return result;
    }
}
