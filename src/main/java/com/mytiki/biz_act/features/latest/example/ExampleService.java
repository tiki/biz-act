package com.mytiki.biz_act.features.latest.example;

public class ExampleService {

    private final ExampleRepository exampleRepository;

    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public ExampleAORsp create(ExampleAOReq req){
        ExampleDO exampleDO = new ExampleDO();
        exampleDO.setName(req.getName());
        exampleDO = exampleRepository.save(exampleDO);
        ExampleAORsp rsp = new ExampleAORsp();
        rsp.setName(exampleDO.getName());
        rsp.setId(exampleDO.getId());
        return rsp;
    }

}
