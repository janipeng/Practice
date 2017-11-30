package org.jani.hello;

public class FakeDisplay implements Display {

    private String lastLine;

    @Override
    public void showLine(String itemLine) {
        this.lastLine = itemLine;
    }

    public String getLastLine() {
        return lastLine;
    }
}
