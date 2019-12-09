package steven.attempt.number.two;

public class HelloWorld {

  public static void main(String[] args) {
    scream(screaming (args));
  }
  private static String screaming(String[] args) {
    return "Hello, " + ((args.length > 0 ) ? args[0] : "World");
  }

  private static void scream(String screaming) {
    System.out.println(screaming);
  }

}
