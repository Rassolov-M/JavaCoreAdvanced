package lesson3_Collection.homework3;
public class MainClass {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Jordan", "89157894516");
        phonebook.add("Martin", "89312541425");
        phonebook.add("Fred","89051111000");
        phonebook.add("Adam", "89776665555");
        phonebook.add("Carl", "89123335566");
        phonebook.add("Fred", "89912541585");

        System.out.println(phonebook);

        System.out.println("Получаем номера");
        System.out.println("Jordan");
        System.out.println(phonebook.get("Jordan"));
        System.out.println("Martin");
        System.out.println(phonebook.get("Martin"));
        System.out.println("Fred");
        System.out.println(phonebook.get("Fred"));
        System.out.println("Adam");
        System.out.println(phonebook.get("Adam"));
        System.out.println("Carl");
        System.out.println(phonebook.get("Carl"));
        System.out.println("Fred");
        System.out.println(phonebook.get("Fred"));

        System.out.println("Случай отсутствия записи");
        System.out.println("Wade");
        System.out.println(phonebook.get("Wade"));

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Martin", "89312541425");
        System.out.println("Zac");
        System.out.println(phonebook.get("Zac"));

    }
}
