package com.ticketsMgrSysWayProv_8520.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ticketsMgrSysWayProv_8520.mapper.RouteInfoMapper;
import com.ticketsMgrSysWayProv_8520.service.RouteInfoService;
import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.RouteInfo;
@Service
public class RouteInfoServiceImpl implements RouteInfoService {
	@Resource
	private RouteInfoMapper routeMapper;
	
	@Override
	public List<RouteInfo> getRoutes() {
		return routeMapper.getRoutes();
	}

	@Override
	public RouteInfo getRouteById(int routeId) {
		return routeMapper.getRouteById(routeId);
	}

	@Override
	public boolean addRoute(RouteInfo route) {
		return routeMapper.addRoute(route)>0?true:false;
	}

	@Override
	public boolean modifyRoute(RouteInfo route) {
		return routeMapper.modifyRoute(route)>0;
	}

	@Override
	public boolean removeRouteById(int routeId) {
		return routeMapper.removeRouteById(routeId)>0?true:false;
	}

}
