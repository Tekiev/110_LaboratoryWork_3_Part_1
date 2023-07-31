package LabThreePartOne;

public class Main {

    public static void main(String[] args) {

        List list = new List();

        list.addElementInBeginning(3);

        list.addElementInBeginning(2);

        list.addElementInBeginning(1);

        list.addElementInEnd(4);

        list.addElementInEnd(5);

        list.addElementInEnd(6);

        System.out.println(list.getHead());

        System.out.println(list.getLast());

        list.printAll();

        list.printAll();

        System.out.println(list.findKey(1));

        list.ifEmpty();

        list.printAll();

        list.findKeyAndDelete(1);

        list.printAll();

        System.out.println(list.getHeadAndDelete());

        System.out.println(list.getLastAndDelete());

        list.printAll();

        list.multiply(5);

        list.printAll();

    }

}
