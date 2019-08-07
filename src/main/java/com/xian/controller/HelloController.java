package com.xian.controller;

import com.xian.common.ReturnType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：mmzs.
 * @ Date       ：Created in 下午3:26 2019/5/9
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@Controller
public class HelloController {

  @ResponseBody
  @RequestMapping("/")
  public ReturnType index()
  {
    ReturnType ret = new ReturnType();
    ret.setErrorCode(500);
    ret.setErrorDesc("111");
    return ret;
  }
  @ResponseBody
  @RequestMapping(value="/haiou/uploadGlassImage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
  public ReturnType book( @RequestBody JSONObject jsonParam){
    ReturnType ret = new ReturnType();
    ret.setErrorCode(500);
    ret.setErrorDesc("111");
    return ret;
  }

}
