package com.demo.design.iCombination.leaf;

import com.demo.design.iCombination.component.Component;
import lombok.extern.slf4j.Slf4j;

/**
 * 叶
 *
 * @author shenghua.song
 * @date 2022/08/22
 */

@Slf4j
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        log.info("叶子节点下不能添加节点！！！");
    }

    @Override
    public void remove(Component component) {
        log.info("叶子节点不能执行删除操作！！！");
    }

    @Override
    public void display(int deep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deep; i++) {
            sb.append("-");
        }
        log.info(sb.append(this.name).toString());
    }
}
