package org.example;

import java.util.List;

/**
 * @Author Hcs
 * @Date 2021-7-2 15:31
 * @Version 1.0
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void show(){
        System.out.println(list.toString());
    }
}