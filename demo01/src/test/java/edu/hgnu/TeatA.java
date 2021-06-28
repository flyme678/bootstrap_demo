package edu.hgnu;

import jdk.nashorn.internal.parser.JSONParser;
import net.minidev.json.JSONUtil;

import java.util.ArrayList;

public class TeatA {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("aaa");
        objects.add("bbb");
        objects.add("ccc");
        objects.add("ddd");
        objects.add("eee");
        System.out.printf(objects.toString());
    }
}
