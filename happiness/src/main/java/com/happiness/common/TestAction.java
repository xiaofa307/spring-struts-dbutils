package com.happiness.common;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class TestAction extends ActionSupport{
	@Resource private DbUtilsTemplate dbutilsTemplate;
	public  String test(){
		String sql = "select * from message";
		List<Map<String, Object>> a = dbutilsTemplate.find(sql);
		System.out.println(a);
		return "success";
	}
}

