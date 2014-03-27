package org.galo.ssm.controller;

import org.galo.ssm.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liang.zhang
 * @email galosmart@foxmail.com
 * @♬~~~1、2、3...木头人...
 * @Msg:
 * 
 */
@Controller
public class IndexController {
	
	@Autowired()
	private IndexDao indexDao;
	
	@RequestMapping(value="index.galo")
	public ModelAndView index(){
		
		System.out.println(indexDao.indexCount());
		return new ModelAndView("index");
	}
}
