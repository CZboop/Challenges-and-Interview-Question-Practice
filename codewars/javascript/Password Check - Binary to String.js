function decodePass( passArr, bin ){
    bin_split = bin.split(" ");
    new_str = "";
    for (i of bin_split){
      i = parseInt(i, 2);
      x = String.fromCharCode(i);
      new_str += x;
    }
    for (i of passArr){
      if (i==new_str){
        return i;
      }
    }
    return false;
  }