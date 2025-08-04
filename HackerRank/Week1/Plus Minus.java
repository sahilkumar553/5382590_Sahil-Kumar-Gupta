    public static void plusMinus(List<Integer> arr) {
        int countZero=0;
        int countpositive=0;
        int countneg=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                countneg++;
            }else if(arr.get(i)>0){
                countpositive++;
            }else{
                countZero++;
            }
        }
        double p=arr.size();
        System.out.printf("%.6f\n",countpositive / p);
        System.out.printf("%.6f\n",countneg / p);
        System.out.printf("%.6f\n",countZero / p);


    }