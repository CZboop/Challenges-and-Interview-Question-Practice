function bigToSmall(arr){
    for (let i=1; i<arr.length; i++){
      arr[0] = arr[0].concat(arr[i]);
    }
    arr = arr[0].sort((a, b) => {return b - a});
    return arr.join(">");
    
  }