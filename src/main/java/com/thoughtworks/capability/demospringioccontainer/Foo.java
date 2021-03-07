package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Foo {

    private Bar bar;

    @PostConstruct
    public void setBar() {
        this.bar.setFoo(this);
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
