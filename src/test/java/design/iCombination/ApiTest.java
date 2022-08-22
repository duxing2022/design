package design.iCombination;

import com.demo.design.hFilter.abstractFilter.Criteria;
import com.demo.design.hFilter.concreteFilter.DryRubbishCriteria;
import com.demo.design.hFilter.concreteFilter.HarmfulRubbishCriteria;
import com.demo.design.hFilter.concreteFilter.RecycledRubbishCriteria;
import com.demo.design.hFilter.concreteFilter.WetRubbishCriteria;
import com.demo.design.hFilter.subject.Rubbish;
import com.demo.design.iCombination.component.Component;
import com.demo.design.iCombination.composite.Composite;
import com.demo.design.iCombination.leaf.Leaf;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_iCombination() {
        Component root = new Composite("C:");
        Component programFiles = new Composite("Program Files");
        Component aTxt = new Leaf("a.txt");

        root.add(programFiles); //添加文件夹
        root.add(aTxt);

        Component git = new Composite("Git");
        Component bJava = new Leaf("b.java");
        programFiles.add(git);
        git.add(bJava);

        root.display(0);
    }
}

