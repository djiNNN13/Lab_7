package Lab_7_yevhenii_kashtalian;

public class Main {
    public static void main(String[] args) {
        double[] array = {3,5,7,1,9};
        double[] array1 = null;
        double[] array2 = {-10,-20,-40,1,8,100};
        double[] array3 = {};
        DataProcessor dp = new DataProcessor(new InsertionSort(), new RowPrinter() ); // here we can choose which sort algorithm we want to use
        dp.processData(array);
        dp.processData(array1);
        dp.processData(array2);
        dp.processData(array3);
    }
}
