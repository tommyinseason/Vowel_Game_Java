import org.junit.*;
import static org.junit.Assert.*;




public class VowelsTest {

  @Test
  public void replaceVowel_forLetter_A(){
    Vowels testVowels = new Vowels();
    String expected = "-";
    assertEquals(expected, testVowels.newVowel("a"));
  }
  @Test
  public void replaceVowel_forLetter_E(){
    Vowels testVowels = new Vowels();
    String expected = "-";
    assertEquals(expected, testVowels.newVowel("e"));
  }
  @Test
  public void replaceVowel_forWord_Apple(){
    Vowels testVowels = new Vowels();
    String expected = "-ppl-";
    assertEquals(expected, testVowels.newVowel("apple"));
  }
  @Test
  public void replaceVowel_forSentence_Apple_Is_Healthy(){
    Vowels testVowels = new Vowels();
    String expected = "_ppl_ is healthy";
    assertEquals(expected, testVowels.newVowel("Apple is healthy"));
  }
}
