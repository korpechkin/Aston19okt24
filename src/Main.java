public class Main {
    public static void main(String[] args) {

        // Задача 2
        Phones.add("Elcin", "1111111");
        Phones.add("Gorbachev", "2222222");
        Phones.add("Brezhnev", "3333333"); // У Брежнева два номера! Это первый
        Phones.add("Brezhnev", "4444444"); // Второй номер Брежнева

        // Вывод номера Брежнева
        System.out.println("Номера для Брежнев: " + Phones.get("Brezhnev"));

        // Вывод номера Ельцин
        System.out.println("Номера для Ельцин: " + Phones.get("Elcin"));

        // Вывод номера Горбачева
        System.out.println("Номера для Горбачев: " + Phones.get("Gorbachev"));
    }
}