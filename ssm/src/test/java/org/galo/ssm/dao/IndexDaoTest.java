package org.galo.ssm.dao;

import junit.framework.Assert;
import common.TestBase;

/**
 * @author liang.zhang
 * @email galosmart@foxmail.com
 * @♬~~~1、2、3...木头人...
 * @Msg:
 * 
 */
public class IndexDaoTest extends TestBase{
	
	private IndexDao indexDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		indexDao = (IndexDao) beanFactory.getBean("indexDao");
	}
	
	public void testIndexCount(){
		
		int i = indexDao.indexCount();
		System.out.println(i);
		Assert.assertNotNull(i);
	}
}
