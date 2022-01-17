function maxMin(arr1,arr2){
    const diffs = [];
    for (let i=0; i<arr1.length; i++){
      diffs.push(Math.abs(arr1[i] - arr2[i]));
  }
    return [Math.max(...diffs), Math.min(...diffs)];
  }