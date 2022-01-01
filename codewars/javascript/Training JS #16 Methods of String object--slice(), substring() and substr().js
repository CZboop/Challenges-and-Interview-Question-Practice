function cutIt(arr){
    var len = Number.POSITIVE_INFINITY;
    for (i in arr){
      if (arr[i].length<len){
        len = arr[i].length;
      }
    }
    for (i in arr){
      arr[i] = arr[i].slice(0,len);
    }
    return arr;
  }