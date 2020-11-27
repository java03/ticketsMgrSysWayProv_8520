package com.ticketsMgrSysWayProv_8520.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ticketsMgrSysWayProv_8520.mapper.StationMapper;
import com.ticketsMgrSysWayProv_8520.service.StationService;
import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.Station;
@Service
public class StationServiceImpl implements StationService {
	@Resource
	private StationMapper stationMapper;
	
	@Override
	public Map<String, List<Station>> getStations() {
		Map<String, List<Station>> result = 
				new TreeMap<String, List<Station>>();
		
		List<Station> stList = stationMapper.getStations();
		
		for (Station station : stList) {
			String key = String.valueOf(
					station.getStationCode().charAt(0)).toUpperCase();
			List<Station> list = result.get(key);
			if(list == null) {
				list = new ArrayList<Station>();
				result.put(key, list);
			}
			list.add(station);	
		}
		
		return result;
	}

	@Override
	public boolean addStation(Station station) {
		return stationMapper.addStation(station)>0?true:false;
	}

	@Override
	public Station getStationById(int stationId) {
		return stationMapper.getStationById(stationId);
	}

	@Override
	public boolean modifyStation(Station station) {
		return stationMapper.modifyStation(station)>0?true:false;
	}

	@Override
	public boolean removeStation(int stationId) {
		return stationMapper.removeStation(stationId)>0?true:false;
	}

	

	

}
