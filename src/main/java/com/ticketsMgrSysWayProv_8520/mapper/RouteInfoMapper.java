package com.ticketsMgrSysWayProv_8520.mapper;

import java.util.List;

import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.RouteInfo;

public interface RouteInfoMapper {
	/**
	 * 获取所有线路
	 */
	public List<RouteInfo> getRoutes();
	
	/**
	 * 获取指定线路
	 */
	public RouteInfo getRouteById(int routeId);
	
	/**
	 * 添加线路
	 */
	public int addRoute(RouteInfo route);
	
	/**
	 * 修改线路
	 */
	public int modifyRoute(RouteInfo route);
	
	/**
	 * 删除指定线路
	 */
	public int removeRouteById(int routeId);

}
