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

package com.haulmont.charts.gui.components.pivot;

import com.haulmont.charts.gui.pivottable.extentsion.model.PivotData;
import com.haulmont.cuba.gui.export.ExportDisplay;

public interface PivotTableExtension {

    /**
     * Exports PivotTable to Xls file.
     */
    void exportTableToXls();

    /**
     * Exports PivotTable to Xls file.
     *
     * @param display export display to save file
     */
    void exportTableToXls(ExportDisplay display);

    /**
     * Sets the file name.
     *
     * @param fileName file name
     */
    void setFileName(String fileName);

    /**
     * @return file name
     */
    String getFileName();

    /**
     * @return JSON string which represents PivotTable with aggregated data
     */
    String getPivotDataJSON();

    /**
     * @return serialized object from JSON which represents PivotTable with aggregated data
     */
    PivotData getPivotData();
}
