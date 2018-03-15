package warmUp;
import java.lang.invoke.SwitchPoint;
import java.util.*;

public class CodingBat2 {

	public static void main(String[] args) {
//		CodingBat2 cb = new CodingBat2();
	    String  [] array1 = {"to", "be", "or", "not", "to", "be"};
	
	}
	
		public ArrayList<String> switchPairs(ArrayList<String> list){
			ArrayList<String> ret = new ArrayList<>();
		if(list.size()%2==0) {
			 for(int i=1, j=0; i < list.size(); j+=2,i+=2) {
				ret.add(list.get(i));
				ret.add(list.get(j));
			}
		} else if(list.size()%2 !=0) {
			for(int i=1, j=0; i < list.size(); j+=2,i+=2) {
				ret.add(list.get(i));
				ret.add(list.get(j)); 
			 }
			ret.add(list.get(list.size()-1));
		}
			
			return ret;
		
	}
	}


