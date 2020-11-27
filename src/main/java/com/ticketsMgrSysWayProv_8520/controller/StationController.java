package com.ticketsMgrSysWayProv_8520.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketsMgrSysWayProv_8520.service.StationService;
import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.Station;

@RestController
@RequestMapping("/station")
public class StationController {
	@Resource
	private StationService stationService;
	
	/**
	 * 获取所有站点
	 */
	@RequestMapping("/getStations")
	public Map<String, List<Station>> getStations(){
		return stationService.getStations();
	}
	
	
	/**
	 * 添加站点
	 */
	@RequestMapping("/addStation")
	public boolean addStation(@RequestBody Station station) {
		return stationService.addStation(station);
	}
	
	/**
	 * 获取指定站点
	 */
	@RequestMapping("/getStation/{stationId}")
	public Station getStationById(@PathVariable int stationId) {
		return stationService.getStationById(stationId);
	}
	
	/**
	 * 修改站点
	 */
	@RequestMapping("/modifyStation")
	public boolean modifyStation(@RequestBody Station station) {
		return stationService.modifyStation(station);
	}
	/**
	 * 删除站点
	 */
	@RequestMapping("/removeStation/{stationId}")
	public boolean removeStation(@PathVariable int stationId) {
		return stationService.removeStation(stationId);
	}
}
