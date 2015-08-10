/*
 * Copyright (c) 2008-2015 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/license for details.
 */

package com.haulmont.charts.gui.amcharts.model.data;

/**
 * @author gorelov
 * @version $Id$
 */
public class DataAddedEvent extends AbstractDataChangeEvent {

    public DataAddedEvent(DataItem item) {
        super(item);
    }
}
