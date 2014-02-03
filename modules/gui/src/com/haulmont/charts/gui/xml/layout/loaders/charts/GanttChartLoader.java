/*
 * Copyright (c) 2008-2013 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/license for details.
 */

package com.haulmont.charts.gui.xml.layout.loaders.charts;

import com.haulmont.charts.gui.components.charts.GanttChart;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Element;

/**
 * @author artamonov
 * @version $Id$
 */
public class GanttChartLoader extends AbstractGanttChartLoader {
    public GanttChartLoader(Context context) {
        super(context);
    }

    @Override
    public GanttChart loadComponent(ComponentsFactory factory, Element element, Component parent) {
        GanttChart chart = (GanttChart) super.loadComponent(factory, element, parent);

        loadDatasource(chart, element);

        return chart;
    }

    protected void loadDatasource(GanttChart component, Element element) {
        String datasource = element.attributeValue("datasource");
        if (!StringUtils.isEmpty(datasource)) {
            CollectionDatasource ds = context.getDsContext().get(datasource);
            if (ds == null) {
                throw new IllegalStateException("Cannot find data source by name: " + datasource);
            }
            component.setCollectionDatasource(ds);
        }
    }
}