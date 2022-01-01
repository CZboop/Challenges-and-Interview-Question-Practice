function pickIt(arr){
    var odd=[],even=[];
    for (var count = 0; count<arr.length; count++){
      if (arr[count]%2==0){
        even.push(arr[count]);
      }
      else{
        odd.push(arr[count]);
      }
    }
    return [odd,even];
  }