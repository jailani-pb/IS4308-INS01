package ch04;

import java.util.TreeMap;

public class MyTreeMap<K,V> extends TreeMap<K,V>{

	//One of your colleagues were asking on how to change the output when
	//sysout a data structure variable.
	@Override
	public String toString() {
		String print = "[\n";
		for(Object key : this.keySet()) {
			print = print + key + "=" + this.get(key) + "\n";
		}
		print = print + "]";
		return print;
	}

}
