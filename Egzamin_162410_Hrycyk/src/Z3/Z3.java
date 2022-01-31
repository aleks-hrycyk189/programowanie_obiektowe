package Z3;
import java.io.File;
import java.util.List;
import java.util.stream.Stream;

public class Z3 {
    public static List<String> bezrozszerzenia(File folder, String rozszerzenie){
        String[] wynik = folder.list(((dir, name) -> true));
        assert wynik != null;
        Stream<String> stream = Stream.of(wynik).map(x -> {
            if (x.contains(rozszerzenie)) {
                return x.replace(rozszerzenie,"");
            }else{
                return x;
            }
        });
        return stream.toList();
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\aleks\\IdeaProjects\\Egzamin_162410_Hrycyk\\src");
        System.out.println(bezrozszerzenia(file,".java"));
    }
}
