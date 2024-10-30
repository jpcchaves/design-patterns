package behavioral;

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void show(String message, String nameToGreet);
}


public class AnonymousInnerClass {

    public static void main(String[] args) {
        A example = () -> System.out.println("Opa");
        example.show();


        B example2 = (String message, String nameToGreet) -> System.out.printf("%s, %s!%n", message, nameToGreet);
        example2.show("Olá", "Jopa");
    }
}
