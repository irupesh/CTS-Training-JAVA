import java.util.*;

public class IndexBuilder {
	
	static TreeSet<Index> buildIndex(HashSet<Player> player){
		TreeSet<Index> result = new TreeSet<Index>();
		
		Iterator<Player> iterator = player.iterator();
		
		while (iterator.hasNext()){   
			Player obj = iterator.next();
			Index location = findIndex(result,obj.getName().charAt(0));
			if(location == null){
				Index newIndex = new Index(obj.getName().charAt(0), 1);
				result.add(newIndex);
			}else{
				result.remove(location);
				location.setCount(location.getCount()+1);
				result.add(location);	
			}
		}	
		return result;
	}
	
	static Index findIndex(TreeSet<Index> index,char ch){     
		Iterator<Index> iterator = index.iterator();
		while (iterator.hasNext()){ 
			Index obj = iterator.next();
			if(obj.getCh()==ch)
				return obj;
		}
		return null;
	}
	
	static void displayIndex(TreeSet<Index> index){
		Iterator<Index> iterator = index.iterator();

		System.out.println(String.format("%-14s%-15s","Player", "Index"));
		   
		   while (iterator.hasNext()){   
			  Index obj = iterator.next();
			  System.out.println(String.format("%-15s%-15d",obj.getCh(), obj.getCount()));
		   }	
	}
}
