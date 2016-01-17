/*
 *    Copyright (C) 2015 - 2016 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.vrem.wifianalyzer.wifi.channelgraph;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UtilsTest {

    @Mock
    private GraphView graphView;
    @Mock
    private LegendRenderer legendRenderer;

    private Utils fixture;

    @Test
    public void testUpdateLegendRenderer() throws Exception {
        // setup
        fixture = new Utils();
        when(graphView.getLegendRenderer()).thenReturn(legendRenderer);
        when(legendRenderer.getTextSize()).thenReturn(20f);
        // execute
        fixture.updateLegendRenderer(graphView);
        // validate
        verify(graphView).getLegendRenderer();

        verify(legendRenderer).resetStyles();
        verify(legendRenderer).setWidth(0);
        verify(legendRenderer).setFixedPosition(0, 0);
        verify(legendRenderer).setTextSize(10f);
    }
}
