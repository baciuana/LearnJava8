package introduction;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {
		
		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		};
		
		FileFilter fileFilterLambda = pathname -> pathname.getName().endsWith(".java");
		
		File dir = new File("D:\\Lucru2\\WIM_GIT_MASTER\\wim\\src\\nl\\vivid\\wim\\dao");
		
		File[] files = dir.listFiles(fileFilterLambda);
		
		for (File f : files) {
			System.out.println(f);
		}
	} 
}
