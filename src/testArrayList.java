import java.util.*;

public class testArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aa");
        al.add("xx");
        al.add("cc");
        System.out.println(al);
        System.out.println(al.get(0));
        al.set(0,"xxxx");
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        System.out.println(al.size());
        Collections.sort(al);
        for(String i : al){
            System.out.println(i);
        }

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("good");
        ll.add("luck");
        System.out.println(ll);
        ll.addFirst("yes!");
        System.out.println(ll);
        ll.addLast("!!!");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        Collections.sort(ll);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        for (String s : ll) {
            System.out.println(s);
        }
        for (int i = 0; i < ll.size();i++) {
            System.out.println(ll.get(i));
        }

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"hello");
        hm.put(2,"world");
        hm.put(3,"!!!");
        System.out.println(hm);
        System.out.println(hm.get(1));
        //hm.remove(1);
        //System.out.println(hm);
        //hm.clear();
        System.out.println(hm);
        for (Integer i : hm.keySet()) {
            System.out.println("key:"+i + ",value:" + hm.get(i));
        }
        for (String s : hm.values()) {
            System.out.println(s);

        }

        HashSet<String> hhh = new HashSet<String>();
        hhh.add("zhang");
        hhh.add("san");
        hhh.add("li");
        hhh.add("si");
        System.out.println(hhh);
        System.out.println(hhh.contains("zhang"));
        hhh.remove("si");
        System.out.println(hhh);
        //hhh.clear();
        System.out.println(hhh.size());
        for (String s : hhh) {
            System.out.println(s);
        }










    }
}
