import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ANames=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 имен для списка А:");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            ANames.add("Aijamal");
            ANames.add("Aizada");
            ANames.add("Aliya");
            ANames.add("Aidai");
            ANames.add("Asel");
        }

        System.out.println("Список А:");
        for (String name : ANames) {
            System.out.println(name);
        }

        ArrayList<String> BNames = new ArrayList<>();
        System.out.println("Введите 5 имен для списка Б:");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            BNames.add("Bayzak");
            BNames.add("Aidar");
            BNames.add("Nursultan");
            BNames.add("Eldar");
            BNames.add("Bekten");
        }

        System.out.println("Список Б:");
        for (String name : BNames) {
            System.out.println(name);
        }

        ArrayList<String> CNames = new ArrayList<>();
        int maxSize = Math.max(ANames.size(), BNames.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < ANames.size()) {
                CNames.add(ANames.get(i));
            }
            if (i < BNames.size()) {
                CNames.add(BNames.get(BNames.size() - 1 - i));
            }
        }

        System.out.println("Список С:");
        for (String name : CNames) {
            System.out.println(name);
        }

        CNames.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Отсортированный список С:");
        for (String name : CNames) {
            System.out.println(name);
        }
    }
}

















