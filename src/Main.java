import java.util.*;

public class Main {

    /* Программа детерминирована, ее результат зависит только от входных данных.
     "Побочных" эффектов нет.
      Была использована монада. */

    public static String getMsg() {
        return new Scanner(System.in).nextLine();
    }

    public static void getDictionary(String msg) {
        List<String> dictionary = new ArrayList<>();

        dictionary.add(msg);
        dictionary.stream()
                .flatMap(v -> Arrays.stream(v.split(" ")))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Речь туземца: ");
        String msg = getMsg();
        System.out.println("Слова в словаре: ");
        getDictionary(msg);

    }
}
