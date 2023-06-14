import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Dublicate.randomValueWithLimit (100,50);
        System.out.println("Оригінальна таблиця " + list1);
        System.out.println();
        List<Integer> list2 = Dublicate.removeDublicatesFirst(list1);
        System.out.println("Таблиця без дублікатів first " + list2);
        System.out.println("Кількість дублікатів " + (list1.size() - list2.size()));
        System.out.println();
        List<Integer> list3 = Dublicate.removeDuplicatesSecond(list1);
        System.out.println("Таблиця без дублікатів second " + list3);
        System.out.println("Кількість дублікатів " + (list1.size() - list3.size()));
    }
}