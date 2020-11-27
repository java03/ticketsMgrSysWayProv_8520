package com.ticketsMgrSysWayProv_8520.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketsMgrSysWayProv_8520.service.RouteInfoService;
import com.ticketsMgrSysWayProv_8520.service.StationService;
import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.RouteInfo;

@RestController
@RequestMapping("/way")
public class RouteInfoController {
	@Resource
	private RouteInfoService routeService;
	@Resource
	private StationService stationService;
	
	/**
	 * 获取所有线路
	 */
	@RequestMapping("/getRoutes")
	public List<RouteInfo> getRoutes(){
		return routeService.getRoutes();
	}
	
	/**
	 * 获取指定线路
	 */
	@RequestMapping("/getRouteById/{routeId}")
	public RouteInfo getRouteById(@PathVariable int routeId) {
		return routeService.getRouteById(routeId);
	}
	
	/**
	 * 添加线路
	 */
	@RequestMapping("/addRoute")
	public boolean addRoute(@RequestBody RouteInfo route) {
		return routeService.addRoute(route);
	}
	
	/**
	 * 修改线路
	 */
	@RequestMapping("/modifyRoute")
	public boolean modifyRoute(@RequestBody RouteInfo route) {
		return routeService.modifyRoute(route);
	}
	
	/**
	 * 删除指定线路
	 */
	@RequestMapping("/removeRouteById/{routeId}")
	public boolean removeRouteById(@PathVariable int routeId) {
		return routeService.removeRouteById(routeId);
	}
	
}
