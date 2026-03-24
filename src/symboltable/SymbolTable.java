package symboltable;

import java.util.*;
import ast.locatables.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<>();
		table.add(new HashMap<>());
	}

	public void set(){
		table.add(new HashMap<>());
		scope++;
	}
	
	public void reset() {
		if(scope>0){
			table.removeLast();
			scope--;
		}else {
			throw new IllegalStateException("Scope is already 0");
		}
	}
	
	public boolean insert(Definition definition) {
		if(table.get(scope).containsKey(definition.getName())) {
			return false;
		}
		definition.setScope(scope);
		table.get(scope).put(definition.getName(),definition);
		return true;
	}
	
	public Definition find(String id) {
		Definition def = table.get(scope).get(id);
		for(int i=scope; i>=0 & def==null; i--){
			def = table.get(i).get(id);
		}
		return def;
	}

	//package-protected for testing pourposes
	boolean findInCurrentScope(String id) {
		Definition def = table.get(scope).get(id);
		if(def == null) return false;
		return true;
	}
}
