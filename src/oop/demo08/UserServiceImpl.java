package oop.demo08;
//抽象类：extends
//类 可以实现接口 1.用implements 实现接口
//2.实现了接口的类，就需要重写接口中的方法
//多继承 利用接口实现多继承
public class UserServiceImpl implements  UserService,TimeService {
    @Override
    public void timer() {

    }

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }
}

