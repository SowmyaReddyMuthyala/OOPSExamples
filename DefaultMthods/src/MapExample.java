import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,13,38,89,71,19);
		List<Integer>l=list.stream().filter(n->n.toString().startsWith("1")).collect(Collectors.toList());
       l.forEach(n->System.out.println(n));

	}

}
