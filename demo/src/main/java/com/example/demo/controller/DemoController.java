package com.example.demo.controller;

import com.example.demo.pojo.CityDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供接口，能够查询出所有城市的所有数据
 * <p>
 * 接口调试工具：swagger-ui
 * postman
 */
@Controller
@Api
public class DemoController {

    @ApiOperation(value = "")
    @RequestMapping(value = "/springBoot/say", method = RequestMethod.GET)
    public @ResponseBody List<CityDTO> say() {

        List<CityDTO> list = new ArrayList<>();
        CityDTO cityDTO1 = new CityDTO();
        list.add(cityDTO1);
        CityDTO cityDTO2 = new CityDTO();
        list.add(cityDTO2);
        return list;
    }

}
