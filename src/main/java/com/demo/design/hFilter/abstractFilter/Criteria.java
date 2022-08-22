package com.demo.design.hFilter.abstractFilter;

import com.demo.design.hFilter.subject.Rubbish;
import java.util.List;

/**
 * 标准
 *
 * @author shenghua.song
 * @date 2022/08/22
 */
public interface Criteria {

    /**
     * 垃圾过滤器
     *
     * @param rubbishes 垃圾
     * @return {@link List}<{@link Rubbish}>
     */
    List<Rubbish> rubbishFilter(List<Rubbish> rubbishes);
}
