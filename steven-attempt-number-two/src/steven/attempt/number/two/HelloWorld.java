package steven.attempt.number.two;

public class HelloWorld {

  public static void main(String[] args) {
    scream((args.length > 0 ) ? args[0] : "World");
  }

  private static void scream(String target) {
    System.out.println("Hello, " + target +"!");
  }

}
