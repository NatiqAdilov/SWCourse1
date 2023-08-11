import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("aq");
        colors.add("qara");
        colors.add("sarı");
        colors.add("qırmızı");
        colors.add("goy");
        colors.add("boz");
        colors.set(2, "saridir");
        colors.set(5, "grey-dir");
        int indexGrey = colors.indexOf("boz");
        if (indexGrey != -1) colors.set(indexGrey, "grey");
        System.out.println(colors.get(2));
        System.out.println(colors.get(5));
    }
}