package za.ac.cput.repository;

import java.util.*;

public interface IRepository <T, ID> {
    T create(T id);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
    Set<T> getAll();
}
