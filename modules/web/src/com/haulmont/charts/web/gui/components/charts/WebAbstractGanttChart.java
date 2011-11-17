/*
 * Copyright (c) 2011 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 */

package com.haulmont.charts.web.gui.components.charts;

import com.haulmont.charts.core.entity.GanttChartItem;
import com.haulmont.charts.gui.components.charts.GanttChart;
import com.haulmont.charts.web.toolkit.ui.charts.GanttChartComponent;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.cuba.gui.data.DatasourceListener;
import com.haulmont.cuba.web.gui.data.CollectionDsWrapper;
import com.haulmont.cuba.web.gui.data.DsManager;

/**
 * <p>$Id$</p>
 *
 * @author artamonov
 */
public abstract class WebAbstractGanttChart<T extends GanttChartComponent>
        extends WebAbstractChart<T>
        implements GanttChart {

    protected CollectionDatasource datasource;
    protected TaskClickListener taskClickListener;

    @Override
    public TaskClickListener getTaskClickListener() {
        return taskClickListener;
    }

    @Override
    public void setTaskClickListener(TaskClickListener taskClickListener) {
        this.taskClickListener = taskClickListener;
    }

    @Override
    public CollectionDatasource getCollectionDatasource() {
        return datasource;
    }

    @Override
    public void setCollectionDatasource(CollectionDatasource datasource) {
        this.datasource = datasource;
        DsManager dsManager = new DsManager(datasource, this);
        CollectionDsWrapper dsWrapper = new CollectionDsWrapper(datasource, true, dsManager);
        component.setContainerDataSource(dsWrapper);
    }
}