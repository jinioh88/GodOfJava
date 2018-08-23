package c.impl.list;

public interface List {
    public void add();
    public void update(int index, Object value);
    public void remove(int index);
    public Object select(int index);
}
