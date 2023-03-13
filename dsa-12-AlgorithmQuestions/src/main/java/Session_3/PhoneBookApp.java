package Session_3;

public class PhoneBookApp {

    public static void main(String[] args) {

        Node entry = new Node("Lorraine", "Cannom", "icryalot@gmail.com", "519-888-8875");
        Node entry12 = new Node("Laura", "Smith", "LorraineCannom@gmail.com", "519-888-8875");
        Node entry2 = new Node("Ramazan", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry3 = new Node("Leyla", "Jones", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry4 = new Node("Sema", "jack", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry5 = new Node("Mark", "Jill", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry6 = new Node("Sara", "Pete", "RamazanCetintas@gmail.com", "519-888-8875");

        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add(entry);
        phoneBook.add(entry2);
        phoneBook.add(entry3);
        phoneBook.add(entry4);
        phoneBook.add(entry5);
        phoneBook.add(entry6);

        phoneBook.print();
        System.out.println(phoneBook.findByName("Mark"));
        phoneBook.deleteByEmail("icryalot@gmail.com");
        phoneBook.print();

        phoneBook.sortByName();
        phoneBook.print();
    }
}
