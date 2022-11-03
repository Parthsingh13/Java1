class Bank{
    public void print(){
        System.out.printf("You are in Bank class.\n");
    }
}
class SBI extends Bank{
    public void print(){
        System.out.printf("You are in SBI class.\n");
    }
}
class AXIS extends Bank{
    public void print(){
        System.out.printf("You are in AXIS class.\n");
    }
}
class ICICI extends Bank{
    public void print(){
        System.out.printf("You are in ICICI class.\n");
    }
}
class Main {
    public static void main(String[] args) {
        Bank obj=new Bank();
        Bank objS=new SBI();
        Bank objA=new AXIS();
        Bank objI=new ICICI();
        obj.print();
        objS.print();
        objA.print();
        objI.print();
    }
}