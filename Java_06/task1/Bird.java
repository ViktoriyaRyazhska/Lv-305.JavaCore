/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.Objects;

public abstract class Bird {
    private String feathers;
    private String layAggs;

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void setLayAggs(String layAggs) {
        this.layAggs = layAggs;
    }

    @Override
    public String toString() {
        return "Bird" +
                "feathers ='" + feathers + '\'' +
                ", layAggs ='" + layAggs + '\'' +
                '}';
    }


    public Bird(String feathers, String layAggs) {
        this.feathers = feathers;
        this.layAggs = layAggs;
    }


    void fly() {

    }

}

