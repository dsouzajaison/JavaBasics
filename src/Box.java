
public class Box {
	
	int width;
	int height;
		
	
	Box(int w, int h){
		
		width = w;
		height = h;
	}
/*boolean isEqual(Box b) {
			
			if (this.width == b.width && this.height == b.height)
				return true;
			else
				return false;
		}*/
public boolean isEqual(Box b) {
	if (this.width == b.width && this.height == b.height)
		return true;
	else
		return false;
	// TODO Auto-generated method stub
	
}


}
