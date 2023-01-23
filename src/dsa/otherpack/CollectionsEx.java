package dsa.otherpack;

import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();

        List<String> names = new ArrayList<>();
        names.add("Wasim");
        names.add("Amresh");
        names.add("Vipin");
        Iterator itr = names.iterator(); // return an iterator object
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Wasim Amresh Vipin
        }

        List<String> states = new LinkedList<>();
        states.add("Odisha");
        states.add("Delhi");
        states.add("Jharkhand");
        states.add("Assam");
        Iterator itr1 = states.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        Vector<String> capitals = new Vector<>();
        List<String> capitals1 = new Vector<>();
        capitals.add("BBSR");
        capitals.add("Ranchi");
        Iterator itr2 = capitals.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.peek()); // 5
        stack.push(1);
        System.out.println(stack.peek()); // 1
        stack.push(3);
        System.out.println(stack.peek()); // 3
        System.out.println(stack.pop()); // 3
        System.out.println(stack.peek()); // 1
        System.out.println(stack.pop()); // 1
        System.out.println(stack.peek()); // 5
        stack.push(6);
        System.out.println(stack.peek()); // 6
        stack.push(4);
        stack.push(2);
        System.out.println(stack.peek());
        Iterator itr3 = capitals.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Ambulance agasfgsgsg");
        queue.add("Fire brigade");
        queue.add("Chief Minister");
        queue.add("Prime Minister");
        System.out.println("head " + queue.element());
        System.out.println("head " + queue.peek());
        Iterator itr4 = queue.iterator();
        while (itr4.hasNext()) {
            System.out.println(itr4.next());
        }
        queue.remove();
        queue.poll();
        Iterator itr5 = queue.iterator();
        while (itr5.hasNext()) {
            System.out.println(itr5.next());
        }
    }
}
