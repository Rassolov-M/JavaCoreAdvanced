package lesson3_Collection.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String lastName, String number){
        if(book.containsKey(lastName)){
            List<String> numbers = book.get(lastName);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для фамилии %s", number, lastName));
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", number, lastName));
            }
        } else {
            book.put(lastName, new ArrayList   (Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s", number, lastName));
        }
    }

    public List<String> get(String lastName){
        if (book.containsKey(lastName)){
            return  book.get(lastName);
        }else{
            System.out.println(String.format("В справочнике нет записи для фамилии %s", lastName));
        }
        return new ArrayList<>();
    }






}
