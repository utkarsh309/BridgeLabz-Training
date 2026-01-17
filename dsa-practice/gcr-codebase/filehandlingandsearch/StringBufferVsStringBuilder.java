package filehandlingandsearch;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
	
		//Number of times
		int times=1000000;
		
		StringBuffer buffer=new StringBuffer();
		
		long startBuffer=System.nanoTime();
		
		for(int index=0;index<times;index++) {
			buffer.append("Hello");
		}
		
		long stopBuffer=System.nanoTime();
		
		System.out.println("String Buffer Execution Time: "+(stopBuffer-startBuffer));
		
		
		
		StringBuilder builder=new StringBuilder();
		
		long startBuilder=System.nanoTime();
		
		for(int index=0;index<times;index++) {
			builder.append("Hello");
		}
		
		long stopBuilder=System.nanoTime();
		
		System.out.println("String Builder Execution Time: "+(stopBuilder-startBuilder));
		
		
		
	}

}
