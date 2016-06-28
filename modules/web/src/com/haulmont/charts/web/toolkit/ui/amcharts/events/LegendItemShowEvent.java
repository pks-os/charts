/*
 * Copyright (c) 2008-2016 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/commercial-software-license for details.
 */

package com.haulmont.charts.web.toolkit.ui.amcharts.events;

import com.haulmont.charts.web.toolkit.ui.amcharts.CubaAmchartsScene;

public class LegendItemShowEvent extends AbstractLegendItemEvent {

    private static final long serialVersionUID = -536343761071370040L;

    public LegendItemShowEvent(CubaAmchartsScene scene, String itemId) {
        super(scene, itemId);
    }
}