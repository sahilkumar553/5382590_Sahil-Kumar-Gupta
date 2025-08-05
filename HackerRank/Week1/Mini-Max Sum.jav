 public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long sum=0;
    long[] sumarr=new long[arr.size()]; //new Array to store sums;
    for(int i=0;i<arr.size();i++){
       sum+=arr.get(i); 
    }
    for(int i=0;i<sumarr.length;i++){
        sumarr[i]=sum-arr.get(i);
    }
      Arrays.sort(sumarr);
      System.out.print(sumarr[0]+" "+sumarr[sumarr.length-1]);
    }