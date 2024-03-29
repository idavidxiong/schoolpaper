/*  Copyright 2010 princehaku
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  Created on : 2010-10-27, 21:39:56
 *  Author     : princehaku
 */
package net.techest.schoolpaper.graph;

import android.graphics.Point;

/**多边形的顶点
 *
 * @author princehaku
 */
class PolygonPoint extends Point {

    int x() {
        return this.x;
    }

    int y() {
        return this.y;
    }

    PolygonPoint(float x, float y) {
        this.x = (int) x;
        this.y = (int) y;
    }
}
