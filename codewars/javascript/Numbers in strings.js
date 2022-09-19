function solve(s){
    const numGroups = [];
    let currentNum = '';
    
    for (let i = 0; i < s.length; i++){
      if ('1234567890'.includes(s[i])){
        currentNum += s[i];
      }
      else if (currentNum != ''){
        numGroups.push(parseInt(currentNum));
        currentNum = '';
      }
    }
    numGroups.push(parseInt(currentNum));
  
  //   removing NaN and falsies with this filter
    return Math.max(...numGroups.filter(x=>x));
  };
  