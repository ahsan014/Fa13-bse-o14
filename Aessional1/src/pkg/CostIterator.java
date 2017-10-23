package pkg;

public class CostIterator implements Iterator {
	
	public boolean hasNext(){
		int i=0;
		int cost1=2;
		if( i<cost1){
			return true;
		} 
		else{
			return false;
		}
	}
	public Object next() {
	      int i=0;
        if(this.hasNext()){
           return i++;
        }
        return null;
     }		

}
