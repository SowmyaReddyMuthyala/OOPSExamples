import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassExample {
	
public static void main(String[] args) {
	
Optional<String> str=Optional.of("hello");
Optional<String> s=Optional.empty();
System.out.println(s);
Optional<Optional<String>> name=Optional.ofNullable(null);
System.out.println(name);
if(str.isPresent()){
System.out.println(str.get());
}
else
{
System.out.println(str.orElseThrow(()->new NoSuchElementException("hello")));
}
}
}
