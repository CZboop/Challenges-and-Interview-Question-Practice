function vowelIndices(word){
    indArray = [];
    vowels = ['a','e','i','o','u','y','A','E','I','O','U','Y'];
    for (i=0; i<word.length; i++){
      if (vowels.includes(word[i])){
        indArray.push(i+1);
      }
    }
    return indArray;
  }