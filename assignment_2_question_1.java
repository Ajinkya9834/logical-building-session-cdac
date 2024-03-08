class Room{

	static int height;
	static int width;
	static int breath;
	
	//parameter constructor to initialize instances
	Room(int h, int w, int b){
		
		 height = h;
		 width = w;
		 breath = b;
	}

	//method to calculate volume of a room
	int volume(int H, int W, int B){
				
		int v = H*W*B;
		return v;
	}

	public static void main(String args[]){
		
		Room obj = new Room(4, 4, 4);

	//	int v = obj.volume(height, width, breath); 	
	//	System.out.println(v);	
		
		System.out.print(obj.volume(height, width, breath));
	}
}