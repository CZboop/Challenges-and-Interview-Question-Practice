function isolateIt(arr){
    return arr.map(x=>x.slice(0,Math.floor(x.length/2))+"|"+x.slice(Math.ceil(x.length/2)));
  }