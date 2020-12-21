package Lab_7_yevhenii_kashtalian;

public class SelectionSort implements Sorter {
    @Override
    public void sort(double[] array) {
        if (array==null){
            throw new NullPointerException("Cannot read the array length because array is null!");
        }
        if (array.length==0){
            throw new IllegalArgumentException("Empty array!");
        }
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j]< array[min]) {
                    min = j;
                }
            }
            double temp = array[i];
            array[i]= array[min];
        }
    }
}
