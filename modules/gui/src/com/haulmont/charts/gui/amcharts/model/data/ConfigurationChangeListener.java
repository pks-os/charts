/*
 * Copyright (c) 2008-2015 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/license for details.
 */

package com.haulmont.charts.gui.amcharts.model.data;

import java.io.Serializable;

/**
 * @author gorelov
 * @version $Id$
 */
public interface ConfigurationChangeListener extends Serializable {

    void dataAdded(DataAddedEvent event);

    void dataRemoved(DataRemovedEvent event);

    void dataUpdated(DataUpdatedEvent event);

    void dataRefreshed();
}
