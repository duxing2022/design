package com.demo.design.kFacade.facade;

import com.demo.design.kFacade.subSystem.Cpu;
import com.demo.design.kFacade.subSystem.HardDrive;
import com.demo.design.kFacade.subSystem.Memory;

/**
 * 计算机外观
 *
 * @author shenghua.song
 * @date 2022/08/24
 */
public class ComputerFacade {

    private Cpu processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new Cpu();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        hd.read();
        ram.load();
        processor.jump();
        processor.execute();
        System.out.println("计算机正常启动完毕");
    }
}
