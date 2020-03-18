package Datagenerator;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class NewOne {

	public static void main(String[] args) throws FilloException {
		

	
		Fillo fillo = new Fillo();
		Connection connection;
		connection = fillo.getConnection("./DataSheets/DataSheet.xlsx");
		String strQuery = "Select * from Sheet where Scenario_ID='SC_1'";
		Recordset recordset = connection.executeQuery(strQuery);
		while (recordset.next()) {
			ArrayList<String> ColCollection = recordset.getFieldNames();
			int Iter;
			int size = ColCollection.size();
			for (Iter = 0; Iter <= (size - 1); Iter++) {
				String ColName = ColCollection.get(Iter);
				String ColValue = recordset.getField(ColName);
				System.out.println(ColValue);
		
			}}	

	}

}
