import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    final static String text = "Fsdfsdfsvv, vvvbnnnf sdd asddd sdd ssddd asddd";

    public static void main(String[] args) {
        Function<String, List<String>> dictionary = text -> Stream.of(text.split(" "))
                .map(elem -> new String(elem).replaceAll("[^a-zA-Z ]", ""))
                .distinct()
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(dictionary.apply(text));
    }
}
