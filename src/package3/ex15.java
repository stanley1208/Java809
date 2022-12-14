package package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex15 {
	
	
	public static void main(String[] args) {
			List<Block>blocks=new ArrayList<>();
			blocks.add(new Block(10,"Green"));
			blocks.add(new Block(7,"Red"));
			blocks.add(new Block(12,"Blue"));
			Collections.sort(blocks, new ColorSort());
		}
	
	

}

class Block{
	String color;
	int size;
	Block(int size,String color){
		this.size=size;
		this.color=color;
	}
	
}

class ColorSort implements Comparator<Block>{

	
	public int compare(Block o1, Block o2) {
		
		return o1.color.compareTo(o2.color);
	}
	
}





	






