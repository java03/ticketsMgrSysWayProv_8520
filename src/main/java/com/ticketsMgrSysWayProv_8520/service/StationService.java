package com.ticketsMgrSysWayProv_8520.service;

import java.util.List;
import java.util.Map;

import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.Station;

public interface StationService {
	/**
	 * 获取所有站点
	 */
	public Map<String, List<Station>> getStations();
	
	/**
	 * 新增站点
	 */
	public boolean addStation(Station station);
	
	/**
	 * 根据id获取指定站点
	 */
	public Station getStationById(int stationId);
	
	/**
	 * 修改站点
	 */
	public boolean modifyStation(Station station);
	/**
	 * 删除站点
	 */
	public boolean removeStation(int stationId);
}
