public class FruitGuy{
 
 public static String[] removeRotten(String[] fruitBasket) {
 if (fruitBasket == null){
    return new String[]{};
 }
else{
   String[] freshFruit = new String[fruitBasket.length];
   for (int i=0; i<fruitBasket.length; i++){
     if (fruitBasket[i].toLowerCase()==fruitBasket[i]){
       freshFruit[i] = fruitBasket[i];
     }
     else {
       freshFruit[i] = fruitBasket[i].replace("rotten","").toLowerCase();
        }
     }
   return freshFruit;
    }
  }
}