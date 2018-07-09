public class myHelloWorld {
  public static void main (String[] args){
    // System.out.println("Hello World! Would you like to meet Wombat?");
    String firstName = "Adam";
    String lastName = "Wallraff";
    Integer age = 31;

    // final String firstName = "Adam";

    System.out.println("Name: "+firstName+" "+lastName+" - Age: "+age);

    if (name.contains("Adam")){
      System.out.println("Your name is Adam!");
    } else if (name == "Bob"){
      System.out.println("Your name is Bob");
    } else {
      System.out.println("I don't know your name...");
    }
    // String name = firstName;
    switch (name){
      case "Adam":
      case "Adam Wallraff":
      System.out.println("Your name is Adam wallraff!");
      break;
      case "Bob":
      System.out.println("Your name is Bob!");
      break;
      default: System.out.println("I don't know you...");
    }

    String favoriteLanguage = firstName == "Adam" ? "Swift" : "Not Sure";
    System.out.println(favoriteLanguage);
  }
}