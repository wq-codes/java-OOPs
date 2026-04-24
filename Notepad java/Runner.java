class Computer{

protected int wordSizeBits;
protected int memorySizeMB;
protected int storageSizeMB;
protected int speedMhz;



// Default Constructor
    public Computer() {
    }

//Parameterized Constructor
public Computer(int wordSizeBits,int memorySizeMB,int storageSizeMB, int speedMhz){
   this.memorySizeMB=memorySizeMB;
   this.speedMhz=speedMhz;
 this.storageSizeMB=storageSizeMB;
   this.wordSizeBits=wordSizeBits;

}
 void Display(){
  System.out.println("Memory Size(MB):"+memorySizeMB+"  Speed(Mhz):"+speedMhz+"  Storage Size(MB):"+storageSizeMB+"  Word Size(Bits)"+wordSizeBits);

 }
}
   class Laptop extends Computer{
private   double objectsLength;
 private   double height;
    private  double weight;
     private double width;

    public Laptop() {
     super();
    }

public Laptop(int wordSizeBits,int memorySizeMB,int storageSizeMB, int speedMhz,double objectsLength, double height,double weight,double width){
   super(wordSizeBits, memorySizeMB, storageSizeMB, speedMhz);
    this.height=height;
    this.objectsLength=objectsLength;
    this.width=width;
    this.weight=weight;
}
   public  void  Display(){
     super.Display();
     System.out.println("Object's Length: "+objectsLength+"\nweight:"+weight+"\nHeight:"+height+"\nWidth:"+width);

   }
  }
    public class Runner{
  public static void main(String[] args) {
       System.out.println("===========Computer==========");
           Computer hp=new Computer(45,76,98,43);
         hp.Display();

        System.out.println("=========Laptop===========");
      Laptop Lenovo = new Laptop(32, 8, 512, 3200, 15.5, 10.2, 65.75, 8.0);
      Lenovo.Display();
  }

    }