import java.util.Arrays;

class sorter {

	public String sort(String letterList) {
	
		char[] arr = letterList.toCharArray();
		Arrays.sort(arr);
		String ourstring = new String(arr);
		return ourstring;
	
	}

}
