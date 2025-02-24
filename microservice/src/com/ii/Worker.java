package com.ii;

// Only one public class is allowed per file. We'll make Worker public
public interface Worker {
    void work();
    void eat();
}

// Package-private (no modifier) classes/interfaces
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Human working");
    }

    @Override
    public void eat() {
        System.out.println("Human eating");
    }
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}

class Human implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human working");
    }

    @Override
    public void eat() {
        System.out.println("Human eating");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot working");
    }
}
