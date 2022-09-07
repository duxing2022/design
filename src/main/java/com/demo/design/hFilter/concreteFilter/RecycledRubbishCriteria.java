package com.demo.design.hFilter.concreteFilter;

import com.demo.design.hFilter.abstractFilter.Criteria;
import com.demo.design.hFilter.subject.Rubbish;
import java.util.ArrayList;
import java.util.List;

/**
 * 回收垃圾标准
 *
 * @author shenghua.song
 * @date 2022/08/22
 */
public class RecycledRubbishCriteria implements Criteria {

    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> rubbishList = new ArrayList<>();
        for (Rubbish rubbish : rubbishes) {
            // 这里只过滤出所有可回收垃圾
            if (rubbish.isRecycled()) {
                rubbishList.add(rubbish);
            }
        }
        return rubbishList;
    }
}
