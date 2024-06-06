public final class finalKeyword {
    final float pi = 3.14f;
    final void printPi(){
        System.out.println(pi);
    }
    public static void main(String args[]){
        finalKeyword obj = new finalKeyword();
        obj.printPi();
    }
}
//for primitive dataypes it prevents reassignment
//for objects it prevents reassignment of reference but the object can be modified