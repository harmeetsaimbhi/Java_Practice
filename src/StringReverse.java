
public class StringReverse {
	
	public int[] reverse(int[] data) {
		for(int i = 0; i < data.length / 2; i++)
		{
		    int temp = data[i];
		    data[i] = data[data.length - i - 1];
		    data[data.length - i - 1] = temp;
		}
		return data;
	}
	
	public static void reverse1(int[] data) {
	    int left = 0;
	    int right = data.length - 1;

	    while( left < right ) {
	        // swap the values at the left and right indices
	        int temp = data[left];
	        data[left] = data[right];
	        data[right] = temp;

	        // move the left and right index pointers in toward the center
	        left++;
	        right--;
	    }
	}

	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,5,6};
		StringReverse Rev = new StringReverse();
		System.out.println("Before" + data);
		Rev.reverse(data);
		System.out.println("After" + data);
		
		// TODO Auto-generated method stub

	}

}
