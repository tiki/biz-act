package com.mytiki.biz_act.features.latest.example;

import com.mytiki.common.ApiConstants;
import com.mytiki.common.reply.ApiReplyAO;
import com.mytiki.common.reply.ApiReplyAOFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ExampleController.PATH_CONTROLLER)
public class ExampleController {
    public static final String PATH_CONTROLLER = ApiConstants.API_LATEST_ROUTE + "example";

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ApiReplyAO<ExampleAORsp> postRefresh(@RequestBody ExampleAOReq body){
        return ApiReplyAOFactory.ok(exampleService.create(body));
    }
}
