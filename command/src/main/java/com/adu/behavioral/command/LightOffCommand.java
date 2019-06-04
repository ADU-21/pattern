package com.adu.behavioral.command;

/**
 * @author LukeDu
 * @date 2019/6/4
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
