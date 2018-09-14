/*
 * Copyright (c) 2008-2016 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/commercial-software-license for details.
 */

package com.haulmont.charts.gui.map.model.listeners;

import com.haulmont.charts.gui.map.model.InfoWindow;

/**
 * Listener to be fired up on info window closing.
 *
 */
public interface InfoWindowClosedListener {

    class InfoWindowCloseEvent {
        private InfoWindow infoWindow;

        public InfoWindowCloseEvent(InfoWindow infoWindow) {
            this.infoWindow = infoWindow;
        }

        public InfoWindow getInfoWindow() {
            return infoWindow;
        }
    }

    void onClose(InfoWindowCloseEvent event);
}