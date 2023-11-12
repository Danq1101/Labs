package lab3.BSUIR.IKT.Number4;

class Magazine implements Printable {
    public String namemag;

    public Magazine(String namemag) {
        this.namemag = namemag;
    }

    @Override
    public void print() {
        System.out.println(namemag);
    }

    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                printable[i].print();
            }
        }
    }
}
