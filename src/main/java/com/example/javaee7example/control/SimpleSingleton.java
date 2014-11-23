package com.example.javaee7example.control;

import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Singleton
public class SimpleSingleton {

    private List<SimplePojo> simpleJsons;

    @PostConstruct
    private void init() {
        List<SimplePojo> modList = new LinkedList<>();
        modList.add(new SimplePojo("message1", 1));
        modList.add(new SimplePojo("message2", 2));
        modList.add(new SimplePojo("message3", 3));
        simpleJsons = Collections.unmodifiableList(modList);
        System.out.println("SimpleSingleton is initialized ok");
    }

    @Schedule(hour = "*", minute = "*", second = "*/15", persistent = false)
    private void schedule() {
        System.out.println("Schedule is ok");
    }

    public List<SimplePojo> getSimplePojos() {
        return simpleJsons;
    }
}
