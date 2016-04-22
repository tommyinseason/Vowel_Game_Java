import org.junit.*;
import static org.junit.Assert.*;




public class VowelsTest {

  @Test
  public void replaceVowel_forLetter_A(){
    Vowels testVowels = new Vowels();
    String expected = "-";
    assertEquals(expected, testVowels.newVowel("b"));
  }
}
