package seventhQuestion;

public interface Repository<T> {
    void save(T data);
    T getById(int id);
}
