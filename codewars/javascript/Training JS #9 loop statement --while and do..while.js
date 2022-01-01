function padIt(str,n){
    var x = 0
    while (x<n){
      if (x%2==0){
        str = '*'+str;
      }
      else{
        str = str+'*';
      }
      x++;
    }
    return str
  }