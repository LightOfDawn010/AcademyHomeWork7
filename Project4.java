package HomeWorkOfLecture7;

public class Project4 {
    public static void main(String[] args) {
        int[] arr = {-10, 15, -4, 11, -8, 22, 16, -11, 55, 18, -60};

        System.out.println("The Positives Sum Is: " + negativesSum(arr));
    }

    private static int negativesSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
}

