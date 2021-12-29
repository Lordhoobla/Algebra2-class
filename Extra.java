//This is for all the extra math calculations that don't fit into the otehrs
public class Extra{
  public static int[] gridFind(int numOf){
    int bet=0;
		while(Algebra.isPrime(numOf)){bet++;numOf--;}
		ArrayList<Integer> nums=new ArrayList<Integer>();
		HashMap<Integer,Integer> numSelect=new HashMap<Integer,Integer>();
		for(int i=1;i<numOf;i++){
			if(numOf%i==0){
				nums.add(Math.abs(numOf/i-i));
				numSelect.put(Math.abs(numOf/i-i),i);
			}
		}
		Collections.sort(nums);
    return new int[]{numSelect.get(nums.get(0)),numFiles/numSelect.get(nums.get(0)),bet};
  }
}
