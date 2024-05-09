import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumOfElementAndMaxElement {

	public static void main(String[] args) {
		List<Integer> n=Arrays.asList(1,2,3,4,5,6,7,8);
		int sum = n.stream().reduce(0, (a, b) -> a + b);
		Optional<Integer> maxElement=n.stream().max(Integer::compareTo);
		System.out.println(maxElement);
		 if (maxElement.isPresent()) {
	            System.out.println("Maximum Element: " + maxElement.get());
	        } else {
	            System.out.println("List is empty");
	        }


	}

}
