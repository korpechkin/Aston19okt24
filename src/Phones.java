import java.util.*;

public class Phones {
    // Применяем HashMap. Ключ - фамилия. Значение - список номеров телефонов
    private static Map<String, List<String>> phones = new HashMap<>();

    // Метод для добавления записей в телефонный справочник
    public static void add(String surname, String phoneNumber) {
        phones.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для поиска номеров телефона по фамилии
    public static List<String> get(String surname) {
        return phones.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        Phones phones = new Phones();


    }
}