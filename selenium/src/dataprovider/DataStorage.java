package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String [][]dataSender(){
		String[][]data= {{"vasanth","vasanth"},{"vasanth","vasa"},{"vasa","vasanth"},{"vasa","vasa"}};
		return data;
	}
	@DataProvider
	public String [][]logIn(){
		String[][]data= {{"vasanth","vasanth"},{"vasanth","vasa"},{"vasa","vasanth"},{"vasa","vasa"}};
		return data;
	}
}
