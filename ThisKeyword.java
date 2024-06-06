class human{
    private String name;
    human(){
        this("unknown");
    }
    human(String name){
        this.name = name;
        this.speak(this);
    }
    human speak(human x){
        System.out.println("My name is :"+x.name);
        return this;
    }
}
public class ThisKeyword {
    public static void main(String args[]){
        human obj = new human("John");
    }   
}
