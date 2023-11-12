package lab2;//6

public class Main6 {
    public static void main(String[] args) {
        Str s = new Str();
        s.setStr("I like Java!!!");
        s.show();
    }
}

class Str{
    String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void show(){
        System.out.println(str.charAt(13) + "\n" + str.endsWith("!!!") + "\n" + str.startsWith("I like"));
        System.out.println(str.contains("Java") + "\n" + str.lastIndexOf("Java") + "\n" + str.replaceAll("a","o"));
        System.out.println(str.toUpperCase() + "\n" + str.toLowerCase() + "\n" + str.substring(7,11));
    }

}