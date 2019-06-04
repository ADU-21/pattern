package com.adu.behavioral.command;

/**
 * @author LukeDu
 * @date 2019/6/4
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
