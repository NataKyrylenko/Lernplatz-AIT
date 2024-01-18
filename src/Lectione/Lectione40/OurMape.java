package Lectione.Lectione40;

public interface OurMape<E,T> {
    public void put(E key, T value);

    public T get( E key);
    public boolean contains(E key);

    public boolean remove( E key);

    public int size();

    
}
