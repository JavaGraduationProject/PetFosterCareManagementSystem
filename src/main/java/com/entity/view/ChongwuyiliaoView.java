package com.entity.view;

import com.entity.ChongwuyiliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物医疗
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-21 12:35:39
 */
@TableName("chongwuyiliao")
public class ChongwuyiliaoView  extends ChongwuyiliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuyiliaoView(){
	}
 
 	public ChongwuyiliaoView(ChongwuyiliaoEntity chongwuyiliaoEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuyiliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
