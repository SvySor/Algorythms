package ru.geekbrains.lesson3;

import java.util.Comparator;

public class LinkedList<T> {

    /**
     * Указатель на первый элемент списка
     */
    public Node head;

    /**
     * Указатель на последний элемент списка
     */
    public Node tail;


    /**
     * Узел
     */
    public class Node {

        /**
         * Ссылка на следующий элемент
         */
        public Node next;

        /**
         * Ссылка на предыдущий элемент
         */
        public Node previous;

        /**
         * Значение узла
         */
        public T value;

    }

    /**
     * Добавление нового элемента в начало списка
     *
     * @param value значение
     */
    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            head.previous = node;
            node.next = head;
        } else {
            tail = node;
        }
        head = node;
    }

    /**
     * Удалить первый элемент списка
     */
    public void removeFirst() {
        if (head != null) {
            Node tmp = head.next;
            tmp.previous = null;
            head.next = null;
            head = tmp;
            if (tmp == null) {
                tail = null;
            }
        }
    }

    /**
     * Поиск элемента в списке по значению
     *
     * @param value значение
     * @return узел
     */
    public Node contains(T value) {
        Node node = head;
        while (node != null) {
            if (node.value.equals(value))
                return node;
            node = node.next;
        }
        return null;
    }

    /**
     * Сортировка
     */
    public void sort(Comparator<T> comparator) {
        Node node = head;
        while (node != null) {

            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null) {
                if (comparator.compare(minValueNode.value, node2.value) > 0) {
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node) {
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }

    /**
     * Добавление элемента в конец списка
     *
     * @param value значение
     */
    public void addLast(T value) {
//        Node node = new Node();
//        node.value = value;
//        if (head == null){
//            head = node;
//        }
//        else{
//            Node lastNode = head;
//            while (lastNode.next != null){
//                lastNode = lastNode.next;
//            }
//            lastNode.next = node;
//        }
        Node node = new Node();
        node.value = value;
        if (tail != null) {
            tail.next = node;
            node.previous = tail;
        } else {
            head = node;
        }
        tail = node;
    }

    public void removeLast() {
//        if (head == null)
//            return;
//        Node node = head;
//        while (node.next != null){
//            if (node.next.next == null){
//                node.next = null;
//                return;
//            }
//             node = node.next;
//        }
//        head = null;
        if (tail != null) {
            Node tmp = tail.previous;
            tmp.next = null;
            tail.previous = null;
            tail = tmp;
            if (tmp == null) {
                head = null;
            }
        }
    }

    public void reverse(){
        if (head != null || head != tail) {
            Node tmpLeft = head;
            Node tmpRight = tail;
            while (tmpLeft.previous != tmpRight && tmpLeft != tmpRight) {
                T buf = tmpLeft.value;
                tmpLeft.value = tmpRight.value;
                tmpRight.value = buf;
                tmpLeft = tmpLeft.next;
                tmpRight = tmpRight.previous;
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node node = head;
        while (node != null) {
            stringBuilder.append(node.value);
            stringBuilder.append(", ");
            node = node.next;
        }
        stringBuilder.setLength(stringBuilder.length()-2);
        return stringBuilder.toString();
    }
}
