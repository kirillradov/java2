import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arrNames = {"Вася", "Ваня","Саша","Митя","Федор", "Глеб","Вася",
                "Геннадий","Федор","Ваня","Петя","Вася","Митя","Ваня", "Валера",
                "Глеб","Ваня", "Петя", "Саша","Эдуард"};

        namesInfo(arrNames);

    }
    public static void namesInfo(String[] arrNames) {
        Set<String> names = new HashSet<>(Arrays.asList(arrNames));
        System.out.println("Уникальные имена: ");
        for (String name : names) {
            System.out.println(name);
        }
        Set<String> namesCount = new HashSet<>();
        ArrayList<String> listNames = new ArrayList<>(Arrays.asList(arrNames));
        System.out.println();
        for(int i = 0; i < listNames.size(); i++) {
            String name = listNames.get(i);
            int count = 0;
            for (String sameName : listNames) {
                if (sameName.equals(name)) {
                    count++;
                }
            }
            namesCount.add(name + " - " + count);
        }

        for (String name : namesCount) {
            System.out.println(name);
        }

    }
}
