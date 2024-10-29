package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 火车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
@TableName("huochexinxi")
public class HuochexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuochexinxiEntity() {
		
	}
	
	public HuochexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 车序号
	 */
					
	private String chexuhao;
	
	/**
	 * 火车类型
	 */
					
	private String huocheleixing;
	
	/**
	 * 车次
	 */
					
	private String checi;
	
	/**
	 * 起点站
	 */
					
	private String qidianzhan;
	
	/**
	 * 终点站
	 */
					
	private String zhongdianzhan;
	
	/**
	 * 开车时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kaicheshijian;
	
	/**
	 * 到站时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date daozhanshijian;
	
	/**
	 * 车票类型
	 */
					
	private String chepiaoleixing;
	
	/**
	 * 座位类型
	 */
					
	private String zuoweileixing;
	
	/**
	 * 列车图片
	 */
					
	private String liechetupian;
	
	/**
	 * 车票价格
	 */
					
	private Integer chepiaojiage;
	
	/**
	 * 列车路线
	 */
					
	private String liecheluxian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：车序号
	 */
	public void setChexuhao(String chexuhao) {
		this.chexuhao = chexuhao;
	}
	/**
	 * 获取：车序号
	 */
	public String getChexuhao() {
		return chexuhao;
	}
	/**
	 * 设置：火车类型
	 */
	public void setHuocheleixing(String huocheleixing) {
		this.huocheleixing = huocheleixing;
	}
	/**
	 * 获取：火车类型
	 */
	public String getHuocheleixing() {
		return huocheleixing;
	}
	/**
	 * 设置：车次
	 */
	public void setCheci(String checi) {
		this.checi = checi;
	}
	/**
	 * 获取：车次
	 */
	public String getCheci() {
		return checi;
	}
	/**
	 * 设置：起点站
	 */
	public void setQidianzhan(String qidianzhan) {
		this.qidianzhan = qidianzhan;
	}
	/**
	 * 获取：起点站
	 */
	public String getQidianzhan() {
		return qidianzhan;
	}
	/**
	 * 设置：终点站
	 */
	public void setZhongdianzhan(String zhongdianzhan) {
		this.zhongdianzhan = zhongdianzhan;
	}
	/**
	 * 获取：终点站
	 */
	public String getZhongdianzhan() {
		return zhongdianzhan;
	}
	/**
	 * 设置：开车时间
	 */
	public void setKaicheshijian(Date kaicheshijian) {
		this.kaicheshijian = kaicheshijian;
	}
	/**
	 * 获取：开车时间
	 */
	public Date getKaicheshijian() {
		return kaicheshijian;
	}
	/**
	 * 设置：到站时间
	 */
	public void setDaozhanshijian(Date daozhanshijian) {
		this.daozhanshijian = daozhanshijian;
	}
	/**
	 * 获取：到站时间
	 */
	public Date getDaozhanshijian() {
		return daozhanshijian;
	}
	/**
	 * 设置：车票类型
	 */
	public void setChepiaoleixing(String chepiaoleixing) {
		this.chepiaoleixing = chepiaoleixing;
	}
	/**
	 * 获取：车票类型
	 */
	public String getChepiaoleixing() {
		return chepiaoleixing;
	}
	/**
	 * 设置：座位类型
	 */
	public void setZuoweileixing(String zuoweileixing) {
		this.zuoweileixing = zuoweileixing;
	}
	/**
	 * 获取：座位类型
	 */
	public String getZuoweileixing() {
		return zuoweileixing;
	}
	/**
	 * 设置：列车图片
	 */
	public void setLiechetupian(String liechetupian) {
		this.liechetupian = liechetupian;
	}
	/**
	 * 获取：列车图片
	 */
	public String getLiechetupian() {
		return liechetupian;
	}
	/**
	 * 设置：车票价格
	 */
	public void setChepiaojiage(Integer chepiaojiage) {
		this.chepiaojiage = chepiaojiage;
	}
	/**
	 * 获取：车票价格
	 */
	public Integer getChepiaojiage() {
		return chepiaojiage;
	}
	/**
	 * 设置：列车路线
	 */
	public void setLiecheluxian(String liecheluxian) {
		this.liecheluxian = liecheluxian;
	}
	/**
	 * 获取：列车路线
	 */
	public String getLiecheluxian() {
		return liecheluxian;
	}

}
