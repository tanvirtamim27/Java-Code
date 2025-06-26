public class MethodeOverloading {
    static void Tamims(){
        System.out.println("My Self Tanvir Islam Tamim");
    }
    static void Tamims(String House){
        System.out.println("Address : "+House);

    }

    static void Tamims(int a,int b){
        System.out.println("Age : "+(a+b));
    }

    public static void main(String[] args) {
        Tamims();
        Tamims("Barishal");
        Tamims(5, 18);
    }
}
