package com.entity.view;

import com.entity.HuocheleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 火车类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
@TableName("huocheleixing")
public class HuocheleixingView  extends HuocheleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuocheleixingView(){
	}
 
 	public HuocheleixingView(HuocheleixingEntity huocheleixingEntity){
 	try {
			BeanUtils.copyProperties(this, huocheleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
