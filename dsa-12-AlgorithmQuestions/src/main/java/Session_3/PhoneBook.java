package Session_3;

public class PhoneBook {
    Node head;
    Node tail;
    int size;

    public PhoneBook() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Node node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.firstName);
            current = current.next;
        }
    }

    public int indexOf(String email) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.email.equals(email)) {
                return index;
            } else {
                index++;
                current = current.next;
            }
        }
        return -1;
    }

    public int findByName(String firstName) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.firstName.equals(firstName)) {
                return index;
            } else {
                index++;
                current = current.next;
            }
        }
        return -1;
    }

    public void deleteByEmail(String email) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node previous = head;

        while (current != null) {
            if (current.email.equals(email)) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;
                } else {
                    previous.next = current.next;
                    current.next = null;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }

    public void sortByName() {
        Node current1 = head;

        if (current1 == tail) {
            return;
        }
        Node current2;
        boolean swap = true;
        while (swap) {
            swap = false;
            current1 = head;
            current2 = head.next;

            while (current1 != null && current2 != null) {
                if (current1.firstName.compareToIgnoreCase(current2.firstName) > 0) {
                    swap = true;
                    swapData(current1, current2);

                }
                current1 = current1.next;
                current2 = current2.next;
            }
        }

    }

    void swapData(Node current1, Node current2) {
        Node temp = new Node(current2.firstName, current2.lastName, current2.email, current2.phoneNumber);

        current2.firstName = current1.firstName;
        current2.lastName = current1.lastName;
        current2.email = current1.email;
        current2.phoneNumber = current1.phoneNumber;

        current1.firstName = temp.firstName;
        current1.lastName = temp.lastName;
        current1.email = temp.email;
        current1.phoneNumber = temp.phoneNumber;
    }
    public  void removeDuplicatedEmails(){
        Node current = head ;

        while (current != null){
           Node distinct = current.next;

           while (distinct != null && distinct.next.email.equals(current.email)){
               distinct = distinct.next;
           }
           current.next = distinct;
           current = distinct;

        }
    }
}
