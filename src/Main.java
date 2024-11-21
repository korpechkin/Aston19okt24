// Задача № 2
public class Main {
	public static void main(String[] args) {
Figure[] figures = new Figure[3];
figures[0] = new Circle(1.0, " чёрный", " белый ");
figures[1] = new Square(2.0, " красный ", " зеленый ");
figures[2] = new Triangle(1.0, 2.0, " синий ", " желтый ");

		for (Figure figure: figures) {
        System.out.println(figure + " Периметр: " + figure.perimeter() +  "  Площадь: " + figure.area());
        }
        }
        }