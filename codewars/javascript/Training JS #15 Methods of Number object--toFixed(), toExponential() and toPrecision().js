function howManySmaller(arr,n){
    var nw = [];
    var count = 0;
    for (i in arr){
      x = arr[i].toFixed(2);
      nw.push(x);
      if (x<n){
        count++;
      }
    }
    return count;
  }