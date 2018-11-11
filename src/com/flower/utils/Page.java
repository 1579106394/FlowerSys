package com.flower.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 用于分页的类
 */
public class Page<T> implements Serializable {
	//每页起始
	private Integer index;

	//当前页
	private Integer currentPage;

	//当前页显示条数
	private Integer currentCount;

	//总条数
	private Integer totalCount;

	//总页数
	private Integer totalPage;

	//参数
	private Map<String, Object> params = new HashMap<String, Object>();

	//每页显示的数据
	private List<T> list = new ArrayList<T>();

	/**
	 * @return the param
	 */
	public Map<String, Object> getParams() {
		return params;
	}

	/**
	 * @param param the param to set
	 */
	public void setParams(Map<String, Object> param) {
		this.params = param;
	}

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the currentCount
	 */
	public Integer getCurrentCount() {
		return currentCount;
	}

	/**
	 * @param currentCount the currentCount to set
	 */
	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}

	/**
	 * @return the totalCount
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * @return the totalPage
	 */
	public Integer getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return the productList
	 */
	public List<T> getList() {
		return list;
	}

	/**
	 * @param list the productList to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}

}
