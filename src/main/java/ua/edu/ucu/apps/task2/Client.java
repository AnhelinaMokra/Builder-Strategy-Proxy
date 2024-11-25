package ua.edu.ucu.apps.task2;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {

    public static AtomicInteger counter = new AtomicInteger();

    private final int id = counter.getAndIncrement();

    private String name;
    private int age;
    private String sex;
    private String email;
}