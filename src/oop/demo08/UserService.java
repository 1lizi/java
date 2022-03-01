package oop.demo08;
//interface 定义的关键字，接口都需要有实现类
public interface UserService {
    //接口中的所有定义都是抽象的 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
