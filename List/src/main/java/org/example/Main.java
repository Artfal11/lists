package org.example;

public class Main {
    public static void main(String[] args) {
        /* ArrayList list = new ArrayList();
        try {
            for (int i = 0; i < 15; i++) {
                Integer x = i;
                list.add(x);
            }
            list.delete(6);
            System.out.println(list.pop());

            for (int i = 0; i < 15; i++){
                System.out.println(list.get(i));
            }
        }
        catch(Exception e){}; */
        LinkedList list1 = new LinkedList();
        try {
            for (int i = 0; i < 15; i++) {
                Integer x = i;
                list1.add(x);
            }
            list1.delete(6);
            System.out.println(list1.pop());
            for (int i = 0; i < 15; i++){
                System.out.println(list1.get(i));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}