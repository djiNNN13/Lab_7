package Lab_7_yevhenii_kashtalian;

public class BubbleSort implements Sorter {

    @Override
    public void sort(double[] array) {
        if (array==null){
            throw new NullPointerException("Cannot read the array length because array is null!");
        }
        if (array.length==0){
            throw new IllegalArgumentException("Empty array!");
        }
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length-1-i; j++){
                if(array[j]<array[j+1]){
                    double tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
