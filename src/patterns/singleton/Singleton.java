package patterns.singleton;

public class Singleton {

    // 1. Create a private static instance of the class
    private static Singleton instance;

    // 2. Make the constructor private so no one can instantiate directly
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    public static Singleton getInstance() {
        if (instance == null) {  // Lazy initialization
            instance = new Singleton();
        }
        return instance;
    }

    // Option 1: Synchronized Method
    // Simple but slightly slower due to synchronization overhead which means all the calls will be in sequence.
    public static synchronized Singleton getSynchronizedInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Option 2: Double-Checked Locking (Efficient)
    // The volatile keyword ensures visibility and prevents instruction reordering.
    private static volatile Singleton volatileInstance;
    public static Singleton getInstanceDoubleCheckLocking() {
        if (volatileInstance == null) {
            synchronized (Singleton.class) {
                if (volatileInstance == null) {
                    volatileInstance = new Singleton();
                }
            }
        }
        return volatileInstance;
    }

    // Option 3: Bill Pugh’s Inner Static Class (Best Practice)
    // This approach is lazy, thread-safe, and does not require synchronization.
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstanceInnerStaticClass() {
        return SingletonHelper.INSTANCE;
    }

    // Option 4: Enum Singleton (Simplest & Safest)
    // Enums are thread-safe, prevent reflection and serialization issues.
    public enum SingletonEnum {
        INSTANCE;

        public void showMessage() {
            System.out.println("Hello from Enum Singleton!");
        }
    }



    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
