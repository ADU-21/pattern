package com.adu.behavioral.command;

/**
 * @author LukeDu
 * @date 2019/6/4
 */
public class InvokeController {
    private Command command;

    public void pressButton() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
