interface A{
    void showA();
}
interface B{
    void showB();
}
class Inher implements A,B{
    public void showA(){
        System.out.println("Interface A..");
    }
    public void showB(){
        System.out.println("Interface B..");
    }
    
}
class Multiple{
    public static void main(String args[]){
        Inher obj = new Inher();
        obj.showA();
        obj.showB();
    }
}
