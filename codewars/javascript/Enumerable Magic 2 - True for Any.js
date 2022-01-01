function any(arr, fun){
    for (i in arr){
      if (fun(arr[i])==true){
        return true;
      }
    }
    return false;
  }