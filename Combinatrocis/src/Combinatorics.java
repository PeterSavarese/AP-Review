public class Combinatorics {

    public static void main(String[] args) {
        System.out.println(numCombinations(5, 3));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int numCombinations(int iChoices, int iSelectNumValues) {
        int iWays = 0;

        if (iSelectNumValues >= iChoices) {
            return 0;
        }

        iWays = factorial(iChoices) / (factorial(3) * factorial(iChoices - iSelectNumValues));

        return iWays;
    }
}
