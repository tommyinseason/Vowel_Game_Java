import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.Arrays;

  public class Vowels {


    public String newVowel (String userInput) {
      userInput = userInput.replaceAll("[aAeEiIoOuU]", "-");
     return userInput;
        }


    }
