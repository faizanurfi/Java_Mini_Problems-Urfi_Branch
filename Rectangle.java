class Rectangle{
	
	public static void main(String[] args){
		//Rectangle rect = new Rectangle(); 
		//System.out.println(rect.area());
		//Rectangle rect2 = new Rectangle(2,4);
		//System.out.println(rect2.area());
		
		//can make a ton of objects quickly
		//instead of creating n variables of length height and area for n objects
		for (int i = 0; i < 5; i++) {
			Rectangle rect = new Rectangle(i,i+1);
			System.out.print("\t"+ "Rectangle " + i + "," + (i+1) +": ");
			System.out.print(rect.area());  
		}
		
		

	}
	
	int length;
	int width; 
	
	public Rectangle(){   //Create Default value for quick initialization (would produce a Rectangle object with (0,0)
		this.length = 0;
		this.width = 0; 
	}
	
	public Rectangle(int l, int w){ //non default constructor (instantiation with specific values)
		this.length = l;
		this.width = w; 
	}
	
	public int getRectLength(){ //no parameters because you want to FIND the length (it is unknown) also returns
		return length; 
	}
	
	public int getRectWidth(){
		return width; 
	}
	
	public void setRectLength(int x){ 	  //paramter because you want to PROVIDE the size, this changes the current length of the instance of the object , does NOT return 
		if(x<0)
		{
			System.out.println("CANT DO THAT");
			return;
		}
		this.length = x;
	}
	
	public void setRectWidth(int x){
		this.width = x;
	}
	
	public int area(){   
		return length*width;
	}
	
	public int perimeter(){
		return 2*length + 2*width;
	}
	
}