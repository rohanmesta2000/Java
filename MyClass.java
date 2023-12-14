public class MyClass {
    int instanceVariable;

    public static void main() {
        MyClass instance = new MyClass();
        instance.instanceVariable = 42;
        int value = instance.instanceVariable;
        System.out.println("Instance variable value: " + value);
    }

    public static void main(String[] args) {
        main();
    }
}
