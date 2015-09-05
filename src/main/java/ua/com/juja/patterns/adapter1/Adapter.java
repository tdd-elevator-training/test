package ua.com.juja.patterns.adapter1;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Object request(Object input) {
        return adaptee.specificRequest(input);
    }
}
