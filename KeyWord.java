public class KeyWord {
    int x,a;
    String y;
    KeyWord(String y){
        
        this(y, 2000);

    }
    KeyWord(String y,int a){
        this.y=y;
        this.a=a;
    }

    void display(){
        System.out.println(y+ " "+ a);
    }
}
