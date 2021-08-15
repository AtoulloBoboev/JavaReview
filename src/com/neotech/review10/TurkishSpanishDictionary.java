package com.neotech.review10;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TurkishSpanishDictionary {
	
	public static void main(String[] args) {
		
		Map<String, String> dictionary = new TreeMap<>();
		
		dictionary.put("ev", "casa");
		dictionary.put("kedi", "gato");
		dictionary.put("esek", "burro");
		dictionary.put("bayrak", "bandera");
		dictionary.put("carsaf", "bandera");
		
		System.out.println(dictionary);
		
		//Set --> No duplicates
		//List --> Insetion order is preserved
		Set<String> turkishWords = dictionary.keySet();
		System.out.println(turkishWords);
		System.out.println("keys --> " + turkishWords);
		
		Collection<String> spanishWords = dictionary.values();
		System.out.println("values --> " + spanishWords);
		
		Set<Entry<String, String>> entries = dictionary.entrySet();
		System.out.println("entries --> " + entries);
		
		System.out.println("----------------------------------------");
		for(Entry<String, String> pair : entries) {
			System.out.println(pair);
			String k = pair.getKey();
			String v = pair.getValue();
			System.out.println(k + "-->" + v);
		}
		
		
	}

}
