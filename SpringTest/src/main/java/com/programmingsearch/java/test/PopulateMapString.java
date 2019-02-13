package com.programmingsearch.java.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

public class PopulateMapString {
	public static void main(String[] args) {
		Map<String, String> populateMap = new LinkedHashMap();
		populateMap.put("Brand", "3M");
		populateMap.put("Category", "Products");
		populateMap.put("Market", "abras");
		String pageTitle = orderPageTitle(populateMap);

		System.out.println(pageTitle);

	}

	private static String orderPageTitle(Map<String, String> populateMap) {

		String pageTitle = "";
		List<String> pageTitleOrder = new ArrayList<String>();
		pageTitleOrder.add("Brand");
		pageTitleOrder.add("for");
		pageTitleOrder.add("Category");
		pageTitleOrder.add("Market");

		int size = populateMap.size();

		boolean substitute = false;
		String substitueValue = "";

		for (String key : pageTitleOrder) {

			/*
			 * if(size == 3){
			 * 
			 * if(populateMap.containsKey(key)){
			 * 
			 * pageTitle += populateMap.get(key) + " "; }else{
			 * 
			 * pageTitle += key + " "; } } else{
			 */
			if (populateMap.containsKey(key)) {

				String value = populateMap.get(key);

				if (!StringUtils.isEmpty(value)) {
					if (substitute) {
						pageTitle += substitueValue + " ";
						substitute = false;
					}
					pageTitle += populateMap.get(key) + " ";
				}

			} else {

				substitute = true;
				substitueValue = key;
			}
		}
		return pageTitle.trim();
	}
}