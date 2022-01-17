package study.whiteship.jvm.classloader;

/**
 * Hello world!
 */
public class App {

    Book book = new Book();

//    static String name = "juho";
    static String name;
    static {
        name = "juho";
    }

    public static void main(String[] args) {
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
