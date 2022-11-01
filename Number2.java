public String getMultiChar(char ch, int n){
  if(n == 0)
            return ch+"";
        return ch + getMultiChar(ch, n-1);
  
}
