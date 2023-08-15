package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {

    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        RectangleValues rectangleValues = rectangleWarehouse.get(rectangle.getId());
        rectangleValues.setPerimeter((rectangle.getSideA() * 2) + (rectangle.getSideB() * 2));
        rectangleValues.setSquare(rectangle.getSideA() * rectangle.getSideB());
    }
}
