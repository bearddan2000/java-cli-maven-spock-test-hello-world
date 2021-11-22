import org.slf4j.Logger
import spock.lang.Specification;

public class TestMain extends Specification {
  public void "smoke test"(){
    expect: "simple test"
    1 + 1 == 2
  }

  public void "parameterized test"(){
    given: "name"
    String name = "Steve"

    when: "passing name to function"
    String res = example.Main.greeting(name)

    then: "string should be 'Hello World, $name'"
    res  == "Hello World, Steve"
  }
}
