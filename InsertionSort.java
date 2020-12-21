package Lab_7_yevhenii_kashtalian;

public class InsertionSort implements Sorter {
    @Override
    public void sort(double[] array) {
        if (array==null){
            throw new NullPointerException("Cannot read the array length because array is null!");
        }
        if (array.length==0){
            throw new IllegalArgumentException("Empty array!");
        }
        for (int j = 1; j < array.length; j++) {
            double current = array[j];
            int i = j-1;
            while ((i > -1) && (array[i] <= current)) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = current;
        }
    }
}
