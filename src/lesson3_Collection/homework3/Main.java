package lesson3_Collection.homework3;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

/*
1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.

2. Написать простой класс ТелефонныйСправочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов ,
тогда при запросе такой фамилии должны выводиться все телефоны.

Желательно как можно меньше добавлять своего,
чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля
(имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(), прописывая add() и get().

Пожалуйста, пройдите короткий опрос, чтобы оценить время выполнения домашнего задания: https://forms.gle/cBoYMPvbABa36jb7A
*/
public class Main {
    public static void main(String[] args) {

        List<String> name = Arrays.asList(
                "Fred", "Jordan", "Nigan", "Jin",
                "Van", "Adam", "Jordan", "Carl",
                "Jin", "Martin", "Wade", "Wilson",
                "Fred", "Jordan", "Nigan", "Jin",
                "Van", "Wade", "Jordan", "Carl",
                "Jin", "Martin", "Wade", "Wilson"
        );

        Set<String> unique = new HashSet<String>(name);
        System.out.println("Выводим массив имён");
        System.out.println(name.toString());
        System.out.println("Выводим уникальные имена");
        System.out.println(unique.toString());
        System.out.println("Колличество встречаемости имён");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(name, key));
        }
    }
}
