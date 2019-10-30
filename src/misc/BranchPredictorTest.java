package misc;

public class BranchPredictorTest {

    public static void main(String[] args) {
        final int size = 10_000_000;

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }

        // https://stackoverflow.com/questions/11227809/why-is-processing-a-sorted-array-faster-than-processing-an-unsorted-array/11227902#11227902
        // odkomentuj seřazení a sleduj, jak se průchod for cyklem zrychlí
        // Arrays.sort(arr);

        long sum = 0;
        long time = System.currentTimeMillis();
        for (int val : arr) {
            if (val > 5_000_000) {
                sum += val;
            }
        }
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(sum);
    }

}
