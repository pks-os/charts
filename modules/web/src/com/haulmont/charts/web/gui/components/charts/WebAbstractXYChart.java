/*
 * Copyright (c) 2011 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 */

package com.haulmont.charts.web.gui.components.charts;

import com.haulmont.charts.gui.components.charts.XYChart;
import com.haulmont.charts.gui.components.charts.XYChartRow;
import com.haulmont.charts.web.gui.components.WebChartsHelper;
import com.haulmont.charts.web.toolkit.ui.charts.XYChartComponent;
import com.haulmont.charts.web.toolkit.ui.charts.XYChartRowComponent;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>$Id$</p>
 *
 * @author zagumennikov
 */
public abstract class WebAbstractXYChart<T extends XYChartComponent>
        extends WebAbstractChart<T>
        implements XYChart {

    private static final long serialVersionUID = -6675638557113699291L;

    protected Collection<XYChartRow> rows = new ArrayList<XYChartRow>();

    @Override
    public Collection<XYChartRow> getRows() {
        return rows;
    }

    @Override
    public void addRow(XYChartRow row) {
        component.addRow((XYChartRowComponent)row.getComponent());
        rows.add(row);
    }

    @Override
    public AxisType getArgumentAxisType() {
        return WebChartsHelper.convertChartAxisType(component.getArgumentAxisType());
    }

    @Override
    public void setArgumentAxisType(AxisType axisType) {
        component.setArgumentAxisType(WebChartsHelper.convertChartAxisType(axisType));
    }

    @Override
    public AxisType getValueAxisType() {
        return WebChartsHelper.convertChartAxisType(component.getValueAxisType());
    }

    @Override
    public void setValueAxisType(AxisType axisType) {
        component.setValueAxisType(WebChartsHelper.convertChartAxisType(axisType));
    }
}