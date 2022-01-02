//This is for all the extra math calculations that don't fit into the otehrs
public class Extra{
  /** This will take a number and retunr the optimal square for that number
  * @param numOf - The purpose of this number is to serve as the total number of positions that need to be assigned
  * @return int[] 
  	- the first number will be the row count
	- The second number will be the column count
	- The third number will be how many will be left out from the square to use for either an additional row or column
  */
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
