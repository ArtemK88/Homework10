//1.Написати програму яка видаляє з колекції цілих чисел всі дублікати, якщо вони є.
// Початкову колекцію з 100 елементів потрібно заповнити випадковими числами (ліміт 50).
// На екран потрібно вивести обидві колекції та кількість видалених дублікатів. (За бажанням можна вирішити декількома способами та порівняти, який з них швидше)

import java.util.*;

public class Dublicate {
    public static List<Integer> randomValueWithLimit(int size, int limit) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(limit));
        }
//        Collections.sort(list);
        return list;
    }

    public static List<Integer> removeDublicatesFirst(List<Integer> list) {
        List<Integer> lI = new ArrayList<>();
        for (Integer list1 : list) {
            if (!lI.contains(list1)) {
                lI.add(list1);
            }
        }
        return lI;

    }

    static List<Integer> removeDuplicatesSecond(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}