package priv.scor.lesson3logback.app.controller;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final static Logger log = LoggerFactory.getLogger(HelloController.class);

	@GetMapping(value = "/hello")
	public String sayHello() {

		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		treemap.put(1234, "北京");
		treemap.put(345, "南京");
		treemap.put(664, "秦皇岛");
		treemap.put(1266, "济南");
		treemap.put(178, "天津");
		treemap.put(1789, "上海");
		treemap.put(1023, "苏州");

		hashmap.put(1234, "北京");
		hashmap.put(345, "南京");
		hashmap.put(664, "秦皇岛");
		hashmap.put(1266, "济南");
		hashmap.put(178, "天津");
		hashmap.put(1789, "上海");
		hashmap.put(1023, "苏州");

		System.out.println("******************TreeMap Output******************");

		Set<Entry<Integer, String>> entrySet = treemap.entrySet();
		for (Entry<Integer, String> ent : entrySet) {

			System.out.println(ent.getValue() + " " + ent.getKey());

		}

		System.out.println("******************HashMap Output***********************");

		Set<Entry<Integer, String>> entrySet1 = hashmap.entrySet();
		for (Entry<Integer, String> ent : entrySet1) {

			System.out.println(ent.getValue() + " " + ent.getKey());

		}
		
		return treemap.toString();
	}
	
	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		treemap.put(1234, "北京");
		treemap.put(345, "南京");
		treemap.put(664, "秦皇岛");
		treemap.put(1266, "济南");
		treemap.put(178, "天津");
		treemap.put(1789, "上海");
		treemap.put(1023, "苏州");

		hashmap.put(1234, "北京");
		hashmap.put(345, "南京");
		hashmap.put(664, "秦皇岛");
		hashmap.put(1266, "济南");
		hashmap.put(178, "天津");
		hashmap.put(1789, "上海");
		hashmap.put(1023, "苏州");

		System.out.println("******************TreeMap Output******************");

		Set<Entry<Integer, String>> entrySet = treemap.entrySet();
		for (Entry<Integer, String> ent : entrySet) {

			System.out.println(ent.getValue() + " " + ent.getKey());

		}

		System.out.println("******************HashMap Output***********************");

		Set<Entry<Integer, String>> entrySet1 = hashmap.entrySet();
		for (Entry<Integer, String> ent : entrySet1) {

			System.out.println(ent.getValue() + " " + ent.getKey());

		}
	}
}
