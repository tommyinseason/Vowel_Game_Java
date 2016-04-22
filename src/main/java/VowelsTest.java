import org.junit.*;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class ScrabbleScoreTest {

  @Test
  public void replaceVowels_forLetter_A(){
    Vowels testVowels = new Vowels();
    assertEquals("-", testVowels.replaceVowels("a"));
  }

}
