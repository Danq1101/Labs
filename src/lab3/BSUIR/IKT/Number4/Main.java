package lab3.BSUIR.IKT.Number4;
//����� �������
public class Main {
    public static void main(String[] args) {
        Printable [] book = new Printable[3];
        book[0] = new Book("������ ������");
        book[1] = new Magazine("GQ");
        book[2] = new Magazine("Ogorodnik");
        for(int i = 0; i < book.length; i++)
        {
            book[i].print();
        }
        System.out.println("------------");
        Book.printBooks(book);
        System.out.println("--------------");
        Magazine.printMagazines(book);

    }
}


