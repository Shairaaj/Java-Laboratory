class Corporate{
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{2,3,4},{3,4,5}};
        int maxSum = 0, sum = 0;
        int dept = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum+=arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                dept = i;
            }
            sum = 0;
        }
        System.out.println("The department with maximum salary: "+dept);
    }
}