public class Main {


    public static void main(String[] args) {
        // Сщздание объекта класса Park
        Park park = new Park();

        // Сщздание объекта класса Attractions для аттракционов парка

        Park.Attractions attraction1 = new Park.Attractions("Аттракцион 1", "10:00-18:00", 100);

        Park.Attractions attraction2 = new Park.Attractions("Аттракцион 2", "11:00-19:00", 150);

// Использование геттеров для получения информации об аттракционах
        System.out.println(attraction1.getName());    //	Выводит имя аттракциона 1

        System.out.println(attraction2.getCost());    //	Выводит цену аттракциона 2

        // Использование сеттера для изменения значения поля

        attraction1.setName("Новое название");

        System.out.println(attraction1.getName()); // выводит Новое название

    }
}