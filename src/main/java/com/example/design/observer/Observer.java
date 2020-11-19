package com.example.design.observer;

public  abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
