class EmptySeats{
    public static void main(String[] args) {
        int[][] seats = new int[][]{{1,0,1},{0,1,1},{0,0,1}};
        int count = 0;
        for(int[] row: seats){
            for(int j = 0; j < row.length; j++){
                if(row[j] == 0) count++;
            }
        }
        System.out.println("The total free seats: "+count);
    }
}