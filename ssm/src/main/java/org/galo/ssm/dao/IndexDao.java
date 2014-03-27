package org.galo.ssm.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author liang.zhang
 * @email galosmart@foxmail.com
 * @♬~~~1、2、3...木头人...
 * @Msg:
 * 
 */
@Repository
public interface IndexDao{
	
	@Select("select 1")
	public Integer indexCount();
}
