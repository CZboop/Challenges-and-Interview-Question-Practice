function rndCode(){
    let code = "";
    
    for (let i=0; i < 2; i++){
      code += String.fromCharCode(~~(13 * Math.random() + 65));
    }
    
    for (let i=0; i < 4; i++){
      code += ~~(10 * Math.random());
    }
   
    let specialChars = ['~','!','@','#','$','%','^','&','*'];
    
    for (let i=0; i < 2; i++){
      code += specialChars[ ~~(specialChars.length * Math.random()) ];
    }
      
    return code;
  }