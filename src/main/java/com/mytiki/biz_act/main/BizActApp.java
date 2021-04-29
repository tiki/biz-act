/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.biz_act.main;

import com.mytiki.biz_act.config.ConfigBizActApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({
        ConfigBizActApp.class
})
@SpringBootApplication
public class BizActApp {

    public static void main(final String... args) {
        SpringApplication.run(BizActApp.class, args);
    }
}