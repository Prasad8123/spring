package com.xworkz.spring.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import org.springframework.stereotype.Component;

@Component
public class Springmap {
	

	public HashMap<String,Integer> hashMap()
	{
		System.out.println("hash map registered with spring");
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("Millerpet", 583101);
		map.put("Gandi nagar", 583102);
		map.put("suda cross", 583104);
		map.put("patel nagar", 583103);
		map.put("manjunatha nagar", 560015);
		
		Set<Entry<String,Integer>> entry=map.entrySet();
	for (Entry<String, Integer> area : entry) {
		
		System.out.println(area.getKey());
		System.out.println(area.getValue());
		
	}
		System.out.println("size : " + map.size());
		
		
		return hashMap();
	}

}
