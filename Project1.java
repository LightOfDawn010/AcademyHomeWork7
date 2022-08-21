package HomeWorkOfLecture7;

public class Project1 {
    public static void main(String[] args) {
        int[] arr = {-10, 15, -4, 11, -8, 22, 16, -11, 55, 18, -60};

        System.out.println("In Total , Positive Numbers in Array are : " + countPositives(arr));
    }

    private static int countPositives(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }
}

