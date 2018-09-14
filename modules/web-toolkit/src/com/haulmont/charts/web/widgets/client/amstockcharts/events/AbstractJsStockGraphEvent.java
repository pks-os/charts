/*
 * Copyright (c) 2008-2016 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/commercial-software-license for details.
 */

package com.haulmont.charts.web.widgets.client.amstockcharts.events;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.NativeEvent;

public class AbstractJsStockGraphEvent extends JavaScriptObject {

    protected AbstractJsStockGraphEvent() {
    }

    public final native String getPanelId() /*-{
        if (this.chart) {
            return this.chart.id;
        }
        return null;
    }-*/;

    public final native String getGraphId() /*-{
        if (this.graph) {
            return this.graph.id;
        }
        return null;
    }-*/;

    public final native NativeEvent getMouseEvent() /*-{
        return this.event;
    }-*/;
}