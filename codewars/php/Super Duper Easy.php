function problem($x){
  if (is_string($x)){
    return "Error";
  }
  else{
    return $x*50+6;
  }
}