package singleton;

public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }
}
