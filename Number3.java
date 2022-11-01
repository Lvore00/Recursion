public long getPowerOfTen(int n){
   if (n == 0) 
   {         
     return 1;     
     
   } 
   else 
   {         
     return 10 * getPowerOfTen(n-1);     
     
   }
}
