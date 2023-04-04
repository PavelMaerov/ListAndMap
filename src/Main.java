import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(7,6,1,1,2,3,4,4,5,5,6,7));
        System.out.println("Задача 1");
        task1(nums);
        System.out.println("Задача 2");
        task2(nums);

        List<String> words = new ArrayList<>(List.of("aaa", "bbb", "bbb", "aaa", "bbb", "ddd", "1", "2", "1"));
        System.out.println("Задача 3");
        task3(words);
        System.out.println("Задача 4");
        task4(words);

    }

    //Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    //Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
    public static void task2(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>(nums);  //уже упорядочено по возрастанию
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    //Напишите код, который выводит в консоль все уникальные слова из списка слов,
    //в котором могут встречаться дубли.
    public static void task3(List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);  //преобразуем список во множество
        for (String word : wordSet) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
    //Напишите код, который выводит в консоль все количество дублей из списка слов
    public static void task4(List<String> wordList) {
        //результат группировки сохраним в мапе, где ключ - слово, значение - количество повторений
        Map<String,Integer> map = new HashMap<>();      //создаем пустой map
        for (String word : wordList) {
            Integer repetitionNumber = map.get(word);   //извлекаем уже найденное количество повторений
            if (repetitionNumber == null) repetitionNumber = 0;
            map.put(word, repetitionNumber + 1);        //записываем увеличенное количество повторений
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("cлово: "+ entry.getKey()+", повторений: "+entry.getValue());
            }
        }
        System.out.println();
    }
}