package lab3.BSUIR.IKT.Number4;

//патерн фасад
class Book implements Printable {
    public String namebook;

    public Book(String namebook) {
        this.namebook = namebook;
    }

    @Override
    public void print() {
        System.out.println(namebook);
    }

    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                printable[i].print();
            }
        }

    }
}
