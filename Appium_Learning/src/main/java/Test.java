import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Test {

		public static void main(String[] args) {
			
			String name = "Hariprasath";
			
			String name2= name.toLowerCase();
			char[] name3 = name2.toCharArray();
			
			for(int i=0;i<name3.length;i++) {
				
				for(int j=i+1; j<name3.length;j++) {
					if(name3[i]==name3[j]) {
						System.out.println(name3[j]);
					}
				}
			}
				
			
			
}
}