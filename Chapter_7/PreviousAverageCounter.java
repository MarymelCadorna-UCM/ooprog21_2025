public class PreviousAverageCounter {

    public static int countGreaterThanPreviousAverage(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i > 0) { 
                double average = (double) sum / i;

                if (arr[i] > average) {
                    count++;
                }
            }

            sum += arr[i];
        }

        return count;
    }

    public static void main(String[] args) {

        int[] responseTimes = {100, 200, 150, 300};

        int result = countGreaterThanPreviousAverage(responseTimes);

        System.out.println("Count: " + result);
    }
}
