package com.capgemini.online_test.util;
import com.capgemini.online_test.dto.Test;
import java.math.BigInteger;
import java.util.*;
public class Test_Rep {
	static HashMap<BigInteger, Test> table = new HashMap<BigInteger,Test>();

	public HashMap<BigInteger,Test> gettable() {
		return table;
	}

	public void setTable(HashMap<BigInteger, Test> table) 
	{
		Test_Rep.table = table;
	}
	public Test_Rep()
	{
		
	}
	public void putData(Test ob)
	{
	table.put(ob.getTestId(),ob);	
	}
	}



	
	
	
	
	
	
}
