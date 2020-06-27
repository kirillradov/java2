import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arrNames = {"Вася", "Ваня","Саша","Митя","Федор", "Глеб","Вася",
                "Геннадий","Федор","Ваня","Петя","Вася","Митя","Ваня", "Валера",
                "Глеб","Ваня", "Петя", "Саша","Эдуард"};

        namesInfo(arrNames);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("89153334443","Иванов");
        phoneBook.add("89155634443","Петров");
        phoneBook.add( "89153383943","Сидоров");
        phoneBook.add( "89153334243","Путин");
        phoneBook.add( "89153834443","Клинтон");
        phoneBook.add( "89151234443","Иванов");
        phoneBook.add( "89153334490","Иванов");

        phoneBook.get("Иванов");

    }
    public static void namesInfo(String[] arrNames) {
        Set<String> names = new HashSet<>(Arrays.asList(arrNames));
        System.out.println("Уникальные имена: ");
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        HashMap<String, Integer> namesCount = new HashMap<>();
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
            namesCount.put(name, count);
        }
        namesCount.entrySet()
                .stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
