package Day3;

interface Printer{
    void print();
}
interface Scanners{
    void scan();
}
class AllInOne implements Printer,Scanners{
    @Override
    public void print() {
        System.out.println("Print the File");
    }

    @Override
    public void scan() {
        System.out.println("Scan the File");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        AllInOne obj = new AllInOne();
        obj.scan();
        obj.print();
    }
}
