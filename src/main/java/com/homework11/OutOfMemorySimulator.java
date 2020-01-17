package main.java.com.homework11;

import java.util.LinkedList;
import java.util.List;

public class OutOfMemorySimulator {
    private List<Object[]> arrays = new LinkedList<>();

    public void runOutOfMemorySimulator(){
        for (; ; ) {
            arrays.add(new Object[100]);
        }
    }
}
