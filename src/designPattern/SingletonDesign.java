package designPattern;

public class SingletonDesign {
  private static SingletonDesign singletonDesignInstance;
  
  private SingletonDesign(){
	  
	  
  }

public static SingletonDesign getSingletonDesign() {
	if(singletonDesignInstance == null){
		singletonDesignInstance = new SingletonDesign();
	}
	return singletonDesignInstance;
}
  
	
	
}
