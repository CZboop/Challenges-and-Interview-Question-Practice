function colorOf(r,g,b){
    var x = [r,g,b];
    for (i in x){
      x[i] = x[i].toString(16);
      if (x[i].length==1){
        x[i] = "0"+x[i];
      }
    }
    var hex = "#"+ x.join('')
    return hex; 
  }