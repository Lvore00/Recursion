public int getNumberOfZerosRecursion(int n){
  if (n == 0) {         
    return 1;     
    
  } 
  else if (n < 10) 
  {         
    return 0;     
    
  } 
    else 
  {         
      int count = getNumberOfZerosRecursion(n / 10);         
      if (n % 10 == 0)                                   //getNumberOfZerosRecursionLoop?
  ++count;         
  return count;     
    
  }
  
}
