import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.collections.Main;

public class MainTest {

  @Test
  public void testMain() {
    Assertions.assertDoesNotThrow(() -> {
      Main.main(new String[]{});
    });
  }
}
