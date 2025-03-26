package yourmom.repository;

import java.util.*;

public interface IRepository <T, ID> {
    T create(ID id);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
    Set<T> getAll();
}
