import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaExpressionExample {
public static void main(String[] args){
	
List<String> listOfNames=Arrays.asList("sowmya","sowkya","swathi","manoj","kiran");
String evenNumbers=listOfNames.stream().filter(s->s.length()>=5).map(s->s.toUpperCase()).collect(Collectors.joining(","));
System.out.println(evenNumbers);
//evenNumbers.forEach(System.out::println);
}
}





