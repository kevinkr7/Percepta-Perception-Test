package com.percepta.model;

public class Option {

    private final String text;
    private final PerceptionType type;

    public Option(String text, PerceptionType type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public PerceptionType getType() {
        return type;
    }
}
