package com.adu.behavioral.command;

/**
 * @author LukeDu
 * @date 2019/6/4
 */
public class Client {
    public static void main(String[] args) {
        InvokeController invoker = new InvokeController();

        Light light = new Light();
        Stereo stereo = new Stereo();

        invoker.setCommand(new LightOnCommand(light));
        invoker.pressButton();

        invoker.setCommand(new StereOnWithCDCommand(stereo));
        invoker.pressButton();

        invoker.setCommand(new LightOffCommand(light));
        invoker.pressButton();

        invoker.setCommand(new StereoOffCommand(stereo));
        invoker.pressButton();
    }
}
