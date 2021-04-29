/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.biz_act.config;

import com.mytiki.biz_act.utilities.UtilitiesConfig;
import com.mytiki.common.exception.ApiExceptionHandlerDefault;
import com.mytiki.common.reply.ApiReplyHandlerDefault;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@Import({
        ConfigProperties.class,
        ApiExceptionHandlerDefault.class,
        ApiReplyHandlerDefault.class,
        UtilitiesConfig.class,
        ConfigFeatures.class,
})
@EnableScheduling
public class ConfigBizActApp {

    @PostConstruct
    void starter(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}
