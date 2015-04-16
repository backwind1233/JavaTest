/**
 * Created by zhihaoguo on 15/4/9.
 */
public class Singleton {
    private static Singleton ourInstance = null;
    public static Singleton getInstance() {
        if (ourInstance == null)
            synchronized (Singleton.class) {
                if (ourInstance == null)
                    ourInstance = new Singleton();
            }
        return ourInstance;
    }
    private Singleton() {
    }
}
