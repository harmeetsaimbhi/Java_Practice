import java.util.* ;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.lang.* ;


public class Arrays {
	
	public int count = 0;
	public boolean duplicate = false;
	
	public int countDuplicates(int[] arr) {
		
		for (int i=0; i<arr.length ; i++) {
			for(int k=i+1; k<arr.length ; k++){
				
				if(arr[k]==arr[i]) {
					
					duplicate = true;
					count++;
					
				}
				
				
			}
		}
			
		
		
		return count ;
		
	}

	Set<Integer> duplicates(final int[] zipcodelist)
	{
	  Set<Integer> lump = new HashSet<Integer>();
	  for (int i : zipcodelist)
	  {
	    if (lump.contains(i)) ;
	    lump.add(i);
	  }
	  return lump;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays a = new Arrays();
		int[] arr = {1,2,3,4,1,2,3};
		int[] array = {1,2,3,4,1,2,3};
		a.countDuplicates(arr);
		System.out.println("the number of duplicates are:" + a.count);
		a.duplicates(array);
		//System.out.println("the number of duplicates are:" + a.lump);
		
		

	}
}

