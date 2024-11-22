import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Создание массива с набором слов

        List<String> words = Arrays.asList(
                "Кеннеди", "Обама", "Линкольн", "Вашингтон", "Трамп", "Клинтон", "Линкольн",
                "Горбачев", "Ельцин", "Брежнев", "Хрущев", "Сталин", "Ленин", "Медведев",
                "Рузвельт", "Ельцин", "Зюганов", "Черномырдин", "Буш", "Кеннеди", "Сталин");


        Map<String, Integer> uniqueWords = new HashMap<>();

        for (String word : words) {
            uniqueWords.put(word, uniqueWords.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : uniqueWords.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}
