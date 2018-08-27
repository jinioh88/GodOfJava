import java.io.Serializable;

public class CastingDTO<T> implements Serializable {
    private T object;
    public void setObject(T obj) {
        this.object = obj;
    }

    public T getObject() {
        return object;
    }
}
