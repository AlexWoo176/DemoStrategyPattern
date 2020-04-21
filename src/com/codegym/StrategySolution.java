package com.codegym;

public abstract class StrategySolution implements Strategy {
    @Override
    public void solve() {
        start();
        while (nextTry() && !isSolution()) {}
        stop();
    }

    protected abstract boolean nextTry();

    protected abstract void start();

    protected abstract boolean isSolution();

    protected abstract void stop();
}
