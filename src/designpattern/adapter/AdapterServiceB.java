package designpattern.adapter;

public class AdapterServiceB {
    ServiceB sb = new ServiceB();

    void runService() {
        sb.runServiceB();
    }
}
