function sumOfDifferences(arr) {
    var total = 0;
    arr = arr.sort(function (a, b) { return b - a; });
    for (i = 0; i<arr.length-1; i++){
      total += arr[i]-arr[i+1];
    }
    return total;
    
  }