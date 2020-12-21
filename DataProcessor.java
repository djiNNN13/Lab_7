package Lab_7_yevhenii_kashtalian;

public class DataProcessor {
    private Sorter sorter;
    private Printer printer;

    public DataProcessor(Sorter sorter, Printer printer) {
        this.sorter = sorter;
        this.printer = printer;
    }

    public void processData(double[] array){
        try{
            sorter.sort(array);
            printer.print(array);
        }catch(NullPointerException | IllegalArgumentException er){
            System.out.println("EXCEPTION!" + er.getMessage());
        }

    }
}
