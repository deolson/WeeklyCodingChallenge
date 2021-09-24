import java.text.DecimalFormat;

public class Memory {

	public static void main(String[] args) {
		String test1 = "32GB";
		String test2 = "2GB";
		String test3 = "512MB";
		String test4 = "1GB";
		String test5 = "-45KB";
		String test6 = "46198";
		String test7 = "WEQESAD";
		
//		subSeven(test1);
//		subSeven(test2);
//		subSeven(test3);
//		subSeven(test4);
//		subSeven(test5);
//		subSeven(test6);
//		subSeven(test7);
		
		System.out.println(subSeven(test3));
	}
	
	private static String subSeven(String memoryLen) throws NumberFormatException {
		DecimalFormat df = new DecimalFormat();
		
		Double initMemory = Double.parseDouble(memoryLen.substring(0, memoryLen.length()-2));
		if(memoryLen.charAt(memoryLen.length()-2) == 'M') {
			initMemory = initMemory / 1000;
		}
		
		Double actualMemory = (initMemory-(initMemory*.07));
		System.out.println("act"+actualMemory);
		
		if(actualMemory < 1) {
			actualMemory = (double) Math.round(actualMemory*1000);
			return df.format(actualMemory)+"MB";
		} else {			
			return df.format(actualMemory)+"GB";	
		}
		
	}

}
