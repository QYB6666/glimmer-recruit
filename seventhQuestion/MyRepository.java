package seventhQuestion;
import java.util.HashMap;
import java.util.Map;

public class MyRepository<T> implements Repository<T> {
   Map<Integer,T> map=new HashMap<>(); 
   int ID=0;
    @Override
    public void save(T data) {
        map.put(ID++, data);
    }

    @Override
    public T getById(int id) {
        return map.get(id);
    }
    

}