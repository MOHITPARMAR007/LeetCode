class Solution {
    public double averageWaitingTime(int[][] customers) {
        int idealtime=1;
        long waitingTime=0;
        for(int customer[]: customers)
        {
            //chef is free 
            if(idealtime<=customer[0])
            {
                idealtime=customer[0]+customer[1];
            }
            else
            {
                idealtime=idealtime+customer[1];
            }
            
                waitingTime+=idealtime-customer[0];
        }
        double Average= (waitingTime/ (double)customers.length );
        return Average;
    }
    
}