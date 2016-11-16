package com.jaosn.gwtproject.shared.enums;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum CustGroup {
	MASS("MASS"), // also has Mass(Special)
	PREMIER("PREMIER"), 
	// select * from b_lookup where bom_grp_id like 'PRE%CUS%'
	P0("PREMIER P0"), P0T("PREMIER P0 TB_P"), P0N("PREMIER P0 TB_N"),
	P1("PREMIER P1"), P1P("PREMIER P1 SP TB_P"), P1S("PREMIER P1 SP"), P1T("PREMIER P1 TB_P"),
	P1N("PREMIER P1 TB_N"),
	P1SP("PREMIER P1SP"),	// depreciated
	P2("PREMIER P2"), P2P("PREMIER P2 SP TB_P"), P2S("PREMIER P2 SP"), P2T("PREMIER P2 TB_P"),
	P2N("PREMIER P2 TB_N"),
	P2SP("PREMIER P2SP"),	// depreciated
	P3("PREMIER P3");

	private String val;
	
	private CustGroup(String val) {
		this.val = val;
	}
	
	public String getValue() {
		return val;
	}
	
	public static CustGroup getFromString(String val) {
		for (CustGroup custGroup : CustGroup.values()) {
			if (val.equals(custGroup.getValue())) {
				return custGroup;
			}
		}
		return null;
	}
	
	public static List<String> getList() {
		List<String> list = new ArrayList<String>();
		for (CustGroup custGroup : CustGroup.values()) {
			list.add(custGroup.getValue());
		}
		return list;
	}
	
	public static Map<String, String> getMap(boolean hasEmpty) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		if (hasEmpty) {
			map.put("", "");
		}
		for (CustGroup custGroup : CustGroup.values()) {
			map.put(custGroup.name(), custGroup.getValue());
		}
		return map;
	}
	
	
}