package pkg;

public class CostRepository implements Calculator{
	{
	
	int cost = 10;
	if(cost>5){
		int w=10;
		double cost1=w*0.50;
	}
	else{
		int w=10;
		double cost1=w*0.75;
	}

	/*@Override
    public Object next(){
    
       if(this.hasNext()){
          return names[index++];
       }
       return null;
    }*/		
	
		
}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}


