/*
	after many year, earth's core is not able to produce a strong eletromagnetic field and humans are dying from cancer. you were designated locate the new planet to a new human civilization.
	in the list, you will find all the possible planets. order them and find its position for our travel.
*/

class EarthLikePlanet {
	public static void main(String []args) {
		int []planets = {4,8,7,3,6,1,85,37,84,9,74,17,46,5,78,36,87,40,98,16,39,86,32,95,49,71,65,23,41,28};
		
		System.out.println("planets: ");
		for(int i=0; i<planets.length; i++) System.out.println(planets[i]);
		
		mergeSort(planets, 0, planets.length-1);
		
		System.out.println("sorted planets: ");
		for(int i=0; i<planets.length; i++) System.out.println(planets[i]);
		
		int pos = binarySearch(planets, 87, 0, planets.length-1);
		
		System.out.println("NEW EARTH POSITION: "+pos+" | PLANET ID: "+planets[pos]);
	}
	
	private static void mergeSort(int []arr, int ini, int end) {
		if(ini < end) {
			int mid = (end+ini)/2;
			
			mergeSort(arr, ini, mid);
			mergeSort(arr, mid+1, end);
			
			merge(arr, ini, mid, end);
		}
	}
	
	private static void merge(int []arr, int ini, int mid, int end) {
		//tamanhos dos arrays auxiliares
		int lSize = mid-ini+1;
		int rSize = end-mid;
		
		// arrays temporarios
		int []left = new int[lSize];
		int []right = new int[rSize];
		
		for(int i=0; i<lSize; i++) left[i] = arr[ini+i];
		for(int j=0; j<rSize; j++) right[j] = arr[mid+j+1];
		
		int i = 0;
		int j = 0;
		int k = ini;
		
		//daqui pra baixo, no mergeSort, tive q olhar tudo
		while(i<lSize && j<rSize) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<lSize) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<rSize) {
			arr[k] = right[j];
			j++;
			k++;
		}
		//ate aq
	}
	
	private static int binarySearch(int []arr, int target, int ini, int end) {
		if(ini <= end) {
			int mid = (end+ini)/2;
			
			if(arr[mid] == target) return mid;
			if(arr[mid] > target) return binarySearch(arr, target, ini, mid-1);
			if(arr[mid] < target) return binarySearch(arr, target, mid+1, end);
		}
		return -1;
	}
}