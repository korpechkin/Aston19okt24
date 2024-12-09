public interface Figure {

    // Метод расчитывает периметр фигур
    default double perimeter() {

        System.out.println("метод по умолчанию");
        return 0;
    }
    // Метод расчитывает площадь фигур
    default double area(){
        System.out.println("метод по умолчанию");
        return 0;
    }
}