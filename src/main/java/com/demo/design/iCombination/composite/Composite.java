package com.demo.design.iCombination.composite;

import com.demo.design.iCombination.component.Component;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * 混合成
 *
 * @author shenghua.song
 * @date 2022/08/22
 */

@Slf4j
public class Composite extends Component {

    private List<Component> nodeList;

    public Composite(String name) {
        super(name);
        nodeList = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        nodeList.add(component);
    }

    @Override
    public void remove(Component component) {
        nodeList.remove(component);
    }

    @Override
    public void display(int deep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deep; i++) {
            sb.append("-");
        }
        log.info(sb.append(this.name).toString());

        nodeList.forEach(n -> n.display(deep + 1));
    }
}
