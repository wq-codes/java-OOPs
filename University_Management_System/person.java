public class person{

private  String name;
private   int age;

public void setName(String name){
      this.name=name;

}
public String getName(){
       return name;

}
public  void setAge(int age){


}
public  int getAge(){
      return age;
}

  public person(){


  }

  public person(String name,int age){
       this.name=name;
       this.age=age;

  }
@Override 
public String toString(){
     return "Name:"+name+"\nAge:"+age;

}
}