package design.hFilter;

import com.demo.design.hFilter.abstractFilter.Criteria;
import com.demo.design.hFilter.concreteFilter.DryRubbishCriteria;
import com.demo.design.hFilter.concreteFilter.HarmfulRubbishCriteria;
import com.demo.design.hFilter.concreteFilter.RecycledRubbishCriteria;
import com.demo.design.hFilter.concreteFilter.WetRubbishCriteria;
import com.demo.design.hFilter.subject.Rubbish;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_hFilter() {
        // 原始数据集合
        List<Rubbish> rubbishList = new ArrayList<>();
        rubbishList.add(new Rubbish("果壳", false, false, true, false));
        rubbishList.add(new Rubbish("陶瓷", false, false, true, false));
        rubbishList.add(new Rubbish("菜根菜叶", false, false, false, true));
        rubbishList.add(new Rubbish("果皮", false, false, false, true));
        rubbishList.add(new Rubbish("水银温度计", true, false, false, false));
        rubbishList.add(new Rubbish("电池", true, false, false, false));
        rubbishList.add(new Rubbish("灯泡", true, false, false, false));
        rubbishList.add(new Rubbish("废纸塑料", false, true, false, false));
        rubbishList.add(new Rubbish("金属和布料", false, true, false, false));
        rubbishList.add(new Rubbish("玻璃", false, true, false, false));

        // 四种不同的过滤标准
        Criteria dryRubbishCriteria = new DryRubbishCriteria();
        Criteria wetRubbishCriteria = new WetRubbishCriteria();
        Criteria harmfulRubbishCriteria = new HarmfulRubbishCriteria();
        Criteria recycledRubbishCriteria = new RecycledRubbishCriteria();

        log.info("干垃圾: ");
        printRubbishes(dryRubbishCriteria.rubbishFilter(rubbishList));

        log.info("湿垃圾: ");
        printRubbishes(wetRubbishCriteria.rubbishFilter(rubbishList));

        log.info("有害垃圾: ");
        printRubbishes(harmfulRubbishCriteria.rubbishFilter(rubbishList));

        log.info("可回收垃圾: ");
        printRubbishes(recycledRubbishCriteria.rubbishFilter(rubbishList));
    }

    private static void printRubbishes(List<Rubbish> rubbishes) {
        for (Rubbish rubbish : rubbishes) {
            log.info(String.valueOf(rubbish));
        }
    }
}

