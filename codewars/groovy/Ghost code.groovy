public class GhostCode{
  public static String helloName(String name){
  // \u000d name=name;
    if(name == null || name.equals(""))
      return "Hello world!";
    else
      return "Hello my name is " + name;
  }
}