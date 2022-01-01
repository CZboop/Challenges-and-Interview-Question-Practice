function none(arr, fun){
    for (i in arr){
      if (fun(arr[i])==true){
        return false;
      }
    }
    return true;
  }