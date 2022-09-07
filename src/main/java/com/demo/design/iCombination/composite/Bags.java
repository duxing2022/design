package com.demo.design.iCombination.composite;

import com.demo.design.iCombination.component.Articles;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;

/**
 * 袋子
 *
 * @author shenghua.song
 * @date 2022/08/22
 */

@Slf4j
public class Bags implements Articles {

    /**
     * 名称
     */
    private String name;

    /**
     * 袋子
     */
    private ArrayList<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }
    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
