package LabThreePartOne;

public class List {

    private Element head;

    public void addElementInBeginning(int data) {   // добавление значения в начало списка

        Element element = new Element(data);

        element.next = head;

        head = element;

    }

    public int getHead() { // извлечение значения из начала списка

        return head.data;

    }

    public int getHeadAndDelete() { // извлечение значения из начала списка с удалением из списка

        Element tmpHead = head;

        head = head.next;

        return tmpHead.data;

    }

    public void addElementInEnd(int data) {  // добавление значения в конец списка

        Element element = new Element(data);

        if (head == null) {

            head = element;

        } else {

            Element last = head;

            while (last.next != null) {
                last = last.next;
            }
            last.next = element;
        }

    }

    public int getLast() { // извлечения значения из конца списка

        Element current = head;

        while (current.next != null) {

            current = current.next;
        }

        return current.data;

    }

    public Element getLastAndDelete() { // извлечения значения из конца списка с удалением


        Element tmpLast;

        Element temp = head;

        Element current = head;


        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;

        tmpLast = current.next;

        current.next = null;

        return tmpLast;


    }

    public String findKey(int key) {   // определение, содержит ли список заданное значение

        Element currentElement = head;

        while ((currentElement) != null) {

            if (currentElement.data == key) {

                return "Список содержит заданное значение";

            }

            currentElement = head.next;

        }

        return "Список не содержит заданное значение";

    }

    public void ifEmpty() {   // является ли список пустым

        Element currentElement = head;

        if (currentElement == null) {
            System.out.println("Список является пустым");
        } else {
            System.out.println("Список не пустой");
        }

    }

    public void printAll() {   // печать всех элементов массива

        System.out.println("Начало списка: ");

        Element currentElement = head;
        while ((currentElement) != null) {
            System.out.println(currentElement.data);
            currentElement = currentElement.next;
        }

        System.out.println("Конец списка.");

    }

    public void findKeyAndDelete(int key) {   // * удаление значение, если оно есть в списке

        Element currentElement = head;

        Element prev = null;

        if (currentElement != null && currentElement.data == key) {

            head = currentElement.next;
            System.out.println("Элемент " + key + " удален из списка");
            return;

        }

        while (currentElement != null && currentElement.data != key) {

            prev = currentElement;

            currentElement = currentElement.next;

        }

        if (currentElement != null) {

            prev.next = currentElement.next;

            System.out.println("Элемент " + key + " удален из списка");

        }

    }

    public void multiply(int m) {   // * перемножение элементов списка на значение параметра метода

        Element currentElement = head;
        while ((currentElement) != null) {
            currentElement.data = currentElement.data * m;
            currentElement = currentElement.next;
        }

    }

    public static class Element {

        public int data;

        public Element next;

        Element(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }

}
