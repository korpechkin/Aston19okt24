public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4" }, {"5", "6", "7", "8" }, {"9", "10", "11", "12" }, {"13", "14", "15", "16" }};
        try {
            int sum = ArrayProcessor.sum2DArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Исключение размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Исключение данных массива в ячейке (" + e.getRow() + "," + e.getCol() + "):" + e.getMessage());
        }
    }
}