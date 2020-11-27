package com.ticketsMgrSysWayProv_8520.mapper;

import java.util.List;

import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.Station;

public interface StationMapper {
	/**
	 * 获取所有站点
	 */
	public List<Station> getStations();
	
	/**
	 * 新增站点
	 */
	public int addStation(Station station);
	
	/**
	 * 根据id获取站点
	 */
	public Station getStationById(int stationId);
	/**
	 * 修改站点
	 */
	public int modifyStation(Station station);
	
	/**
	 * 删除站点
	 */
	public int removeStation(int stationId);
}
