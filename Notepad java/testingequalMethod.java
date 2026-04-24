
class Student{

String name;
int rollNo;

public Student(String name,int rollNo){
   this.name=name;
   this.rollNo=rollNo;

}
//OverRiding Equal Method
//if it is not Override then by default ,it compare memory locations.
@Override
public boolean equals(Object obj){
       if (obj==null)
          return false;

     Student other=(Student) obj;
       return (this.name.equals(other.name));
       

          }
}

public class testingequalMethod{

public static void main(String[] args){

   Student S1=new Student("Waqar",143);
   Student S2=new Student("Waqar" ,143);


   if(S1.equals(S2)){    

     System.err.println("Equal");
}
     else{
        System.err.println("Not equal");
     }

}

}