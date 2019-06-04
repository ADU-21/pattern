package com.adu.behavioral.command;

/**
 * @author LukeDu
 * @date 2019/6/4
 */
public class StereOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(13);
    }
}
