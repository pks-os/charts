/*
 * Copyright (c) 2008-2016 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/commercial-software-license for details.
 */

package com.haulmont.charts.gui.amcharts.model;

public enum ValueLabelPosition implements ChartEnum {
    BOTTOM("bottom"),
    TOP("top"),
    RIGHT("right"),
    LEFT("left"),
    INSIDE("inside"),
    MIDDLE("middle");

    private String id;

    ValueLabelPosition(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id;
    }
}