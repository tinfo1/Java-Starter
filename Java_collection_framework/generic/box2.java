package Java_collection_framework.generic;

public class box2<T> {
    private T value;
    public box2(T value){
        this.value=value;
    }
    T getValue(){
        return this.value;
    }
    void setValue(T value){
        this.value=value;
    }
}
