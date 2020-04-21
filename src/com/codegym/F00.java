package com.codegym;

public class F00 extends StrategySolution {
    private int state = 1;

    @Override
    protected boolean nextTry() {
        System.out.print("NextTry-" + state++ + "  ");
        return false;
    }

    @Override
    protected void start() {
        System.out.println("Start ");
    }

    @Override
    protected boolean isSolution() {
        System.out.print("IsSolution-" + (state == 3) + "  ");
        return (state == 3);
    }

    @Override
    protected void stop() {
        System.out.println("Stop ");
    }
}
