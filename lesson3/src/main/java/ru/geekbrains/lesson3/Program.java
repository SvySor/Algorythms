package ru.geekbrains.lesson3;

public class Program {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        singleton1.setSetting1(12);
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setSetting1(12);
        //Singleton singleton3 = new Singleton();
        //LinkedList<Employee>.Node node = null;

        Employee employee1 = new Employee("AAAAA", 33);
        Employee employee2 = new Employee("NNN", 32);

        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("CCC", 43));
        linkedList1.addFirst(new Employee("AAAAA", 25));
        linkedList1.addFirst(new Employee("NNN", 32));
        linkedList1.addFirst(new Employee("EE", 55));
        linkedList1.addFirst(employee1);
        linkedList1.addFirst(new Employee("AAAAA", 45));
        linkedList1.addFirst(new Employee("DDDD", 22));

        System.out.println(linkedList1);

//        linkedList1.sort(new EmployeeComparator(SortType.Ascending));
//
//        System.out.println();
//        System.out.println(linkedList1);
//
//        linkedList1.sort(new EmployeeComparator(SortType.Descending));
//
//        System.out.println();
//        System.out.println(linkedList1);
//
//        LinkedList<Employee>.Node node = linkedList1.contains(employee1);
//        if (node != null){
//            System.out.println("Элемент найден");
//            System.out.println("Значение элемента: " + node.value);
//        }
//        else{
//            System.out.println("Элемент не найден");
//        }
//
//        linkedList1.removeFirst();
//        linkedList1.removeLast();

        linkedList1.reverse();

        System.out.println();
        System.out.println(linkedList1);
    }
}
