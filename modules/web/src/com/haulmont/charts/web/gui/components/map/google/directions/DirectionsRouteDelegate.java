/*
 * Copyright (c) 2008-2019 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.charts.web.gui.components.map.google.directions;

import com.haulmont.bali.util.Preconditions;
import com.haulmont.charts.gui.map.model.Bounds;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.directions.DirectionsLeg;
import com.haulmont.charts.gui.map.model.directions.DirectionsRoute;
import com.haulmont.charts.web.gui.components.map.google.BoundsDelegate;
import com.haulmont.charts.web.gui.components.map.google.DelegateHelper;

import java.util.List;

public class DirectionsRouteDelegate implements DirectionsRoute {

    private com.haulmont.charts.web.widgets.client.addons.googlemap.services.DirectionsRoute directionsRoute;

    public DirectionsRouteDelegate(com.haulmont.charts.web.widgets.client.addons.googlemap.services.DirectionsRoute directionsRoute) {
        Preconditions.checkNotNullArgument(directionsRoute);
        this.directionsRoute = directionsRoute;
    }

    public com.haulmont.charts.web.widgets.client.addons.googlemap.services.DirectionsRoute getDirectionsRoute() {
        return directionsRoute;
    }

    public void setDirectionsRoute(com.haulmont.charts.web.widgets.client.addons.googlemap.services.DirectionsRoute directionsRoute) {
        this.directionsRoute = directionsRoute;
    }

    @Override
    public Bounds getBounds() {
        return BoundsDelegate.fromLatLonBounds(directionsRoute.getBounds());
    }

    @Override
    public void setBounds(Bounds bounds) {
        directionsRoute.setBounds(bounds != null ? ((BoundsDelegate) bounds).getBounds() : null);
    }

    @Override
    public String getCopyrights() {
        return directionsRoute.getCopyrights();
    }

    @Override
    public void setCopyrights(String copyrights) {
        directionsRoute.setCopyrights(copyrights);
    }

    @Override
    public List<DirectionsLeg> getLegs() {
        return DelegateHelper.toCubaDirectionsLegs(directionsRoute.getLegs());
    }

    @Override
    public void setLegs(List<DirectionsLeg> legs) {
        directionsRoute.setLegs(DelegateHelper.toGoogleDirectionsLegs(legs));
    }

    @Override
    public List<GeoPoint> getOverviewPath() {
        return DelegateHelper.toGeoPoints(directionsRoute.getOverviewPath());
    }

    @Override
    public void setOverviewPath(List<GeoPoint> overviewPath) {
        directionsRoute.setOverviewPath(DelegateHelper.toLatLon(overviewPath));
    }

    @Override
    public String[] getWarnings() {
        return directionsRoute.getWarnings();
    }

    @Override
    public void setWarnings(String[] warnings) {
        directionsRoute.setWarnings(warnings);
    }

    @Override
    public int[] getWaypointOrder() {
        return directionsRoute.getWaypointOrder();
    }

    @Override
    public void setWaypointOrder(int[] waypointOrder) {
        directionsRoute.setWaypointOrder(waypointOrder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionsRouteDelegate that = (DirectionsRouteDelegate) o;

        if (directionsRoute != null ? !directionsRoute.equals(that.directionsRoute) : that.directionsRoute != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return directionsRoute != null ? directionsRoute.hashCode() : 0;
    }
}