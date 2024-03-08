class Box{
	
	float height;
	float width;
	float breadth;

	Box(float h, float w, float b){
		height = h;
		width = w;
		breadth = b;
	}
	
	//compute volume
	float getVolume(){
		float volume = height * width * breadth;
		return volume;
	}

	//compute surface area
	float getArea(){
		float s_area = 8*height*height*width*width*breadth*breadth;
		return s_area; 
	}
	
	public static void main(String kk[]){
	
		Box dimension = new Box(5.1f, 10.0f, 5.5f);
		Box dimension1 = new Box(2.0f, 3.5f, 4.5f);

		//BOX 1 volume and surface area
		float volume = dimension.getVolume();
		float s_area = dimension.getArea();

		//BOX 2 volume and surface area
		float volume1 = dimension1.getVolume();
		float s_area1 = dimension1.getArea();

		System.out.println("Box 1 volume = "+volume+ " and surface area = "+s_area);

		System.out.println("Box 2 volume = "+volume1+ " and surface area = "+s_area1);	

	}

}