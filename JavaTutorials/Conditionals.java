// Java Tutorials PreWork

//Conditionals
public class Main {
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = a;
        String d = c;
        boolean b1 = a == b;
        boolean b2 = b.equals(a);
        boolean b3 = !c.equals(a +"l");

        if (b1 && b2 && b3){
            System.out.println("Success!");
        }
    }
}