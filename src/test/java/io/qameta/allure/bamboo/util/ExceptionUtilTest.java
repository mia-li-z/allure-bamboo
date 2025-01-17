/*
 *  Copyright 2016-2023 Qameta Software OÜ
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
 */
package io.qameta.allure.bamboo.util;

import org.junit.Test;

import static io.qameta.allure.bamboo.util.ExceptionUtil.stackTraceToString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ExceptionUtilTest {

    @Test
    public void itShouldPrintStackTraceIntoString() {
        try {
            throw new RuntimeException("Print me please");
        } catch (RuntimeException e) {
            final String trace = stackTraceToString(e);
            assertThat(trace, containsString("RuntimeException: Print me please"));
            assertThat(trace, containsString("itShouldPrintStackTraceIntoString(ExceptionUtilTest.java:29)"));
        }
    }
}
