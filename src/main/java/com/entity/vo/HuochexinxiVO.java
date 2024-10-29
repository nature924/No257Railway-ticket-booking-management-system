package com.entity.vo;

import com.entity.HuochexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 火车信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
public class HuochexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
