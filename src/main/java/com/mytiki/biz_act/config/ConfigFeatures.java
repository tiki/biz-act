/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.biz_act.config;

import com.mytiki.biz_act.features.latest.example.ExampleConfig;
import org.springframework.context.annotation.Import;

@Import({
        ExampleConfig.class,
})
public class ConfigFeatures {
}
