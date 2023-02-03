// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
// который вернет “перевернутый” список.

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list_initial = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list_initial.add(i);
        }
        System.out.println(list_initial);
        Transpot_list(list_initial);
        System.out.println(Transpot_list(list_initial));
    }

        private static LinkedList<Integer> Transpot_list(LinkedList<Integer> list1) {
        LinkedList<Integer> transp_list = new LinkedList<>();
        for (int i = list1.size(); i > 0; i--) {
            transp_list.add(list1.size()-i,list1.get(i));
        }
        return transp_list;
    }
}
