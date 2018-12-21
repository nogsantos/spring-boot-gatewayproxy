package me.fabricionogueira.zuul.springbootzuulgatewayproxy.student;

public class StudentModel {
    String name;
    String address;
    String cls;

    public StudentModel(String name, String address, String cls) {
        super();
        this.name = name;
        this.address = address;
        this.cls = cls;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCls() {
        return cls;
    }
}
