package test;

import java.util.regex.Pattern;

import static test.GenericCast.casts;

class A {
}

class B extends A {
}

class C extends B {
}

class Person {
    int i = 1;
}

class Studen extends Person {
    int i = 2;

    public void method() {
        System.out.println(super.i + " " + this.i);
    }
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

interface frobnicate {
    public void twiddle(String s);
}

class Frob implements frobnicate {
    public void twiddle(String s) {
    }

    ;

    public void twiddle(Integer i) {
    }

    ;
}

interface Event {
    String type = "Event";

    public void details();
}

/*class Quiz{
    static String type = "Quiz";
}

class PracticeQuiz extends Quiz implements Event{
    public void details() {
        System.out.println(type);
    }
}*/


class Plant {
    public void smell() {
        System.out.println("Smells");
    }
}

class Rose extends Plant {
    public void prick() {
        System.out.println("Prickles");
    }
}

class Camomile extends Plant {
    public void cure() {
        System.out.println("Cures");
    }
}

class Base {
    public void show(int i) {
    }
}

class Quest extends Base {
    void show(short i) {
    }
}

class NoInkException extends Exception {
}

class Pen {
    void write(String val) throws NoInkException {
    }

    void article() {
       /* try{
            new Pen();write("story");
        }catch(NoInkException e){}*/
         /*try{
            new Pen();write("story");
        }finally {}*/
        /* try{
            write("story");
        }catch(Exception e){}*/
        /* try{
            new Pen();write("story");
        }catch(RuntimeException e){}*/

    }
}

class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "[" + val + "]";
    }
}

class BoxPrinter2<T> {
    private String val;

    public BoxPrinter2(String arg) {
        val = arg;
    }

    public String toString() {
        return "[" + val + "]";
    }
}

class Utilites {
    public static <T> void fill(T[] array, T val) {
        for (int i = 0; i < array.length; i++)
            array[i] = val;
    }
}

class GenericCast {
    static <E> E casts(Object item) {
        return (E) item;
    }
}

class Q<T> {
    T mem;

    public Q(T arg) {
        mem = arg;
    }
}

interface EnumBase {
}

enum AnEnum implements EnumBase {
    ONLY_MEM;
}

class Coffee{
    enum CoffeeSize{BIG, HUGE,OVER}
    CoffeeSize size;
    public Coffee(){}
}
public class Test {
    public void printOperationInc() {
        int a = 10;
        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a);
    }

    void floated() {
        int i = 4;
        float f = 4.3f;
        double d = 1.8;
        int c = 0;
        if (i == c) c++;
        if ((int) (f + d) == ((int) f + (int) d)) c += 2;
        System.out.println(c);
    }

    void doWhileWhile() {
        int i = 10;
        do {
            while (i < 15)
                i = i + 20;
        } while (i < 2);
        System.out.println(i);
    }

    void class3() {
        for (int i = 1; i < 4; i++)
            switch (i) {
                case 0:
                    System.out.print("a ");
                    break;
                case 1:
                    System.out.print("b ");
                case 2:
                    System.out.print("c ");
                    break;
                default:
                    System.out.print("d ");
            }
    }

    /*void intByte(){
        int i = 51;
        byte b= 1;
        while (b<i){
            b= ++i *2;
        }
        System.out.println(b + " , " + i);
    }*/

   /* void caseAB(){
        int a = 10, b = 20, c = 30;
        switch (a){
            case b+c: System.out.println(b + c); break;
            case 10*7: System.out.println(10 + c); break;
        }
    }*/

    void arR() {
        int arr[] = new int[5];
        System.out.println(arr[0]);
    }

    void outerInner() {
        String[] programmers = {"Outher", "Inner"};
        for (String outer : programmers) {
            for (String inner : programmers) {
                if (inner.equals("Inner"))
                    break;
                System.out.println(inner + ":");
            }
        }
    }

    void classABC() {
        A obj1 = new A();
        C obj2 = new C();
        obj1 = obj2;
        //obj1= (B) obj2;
        //obj1 = new C();
        //obj1 = (C) new B();
        C obj3 = (C) obj1;
    }

    void personStudent() {
        Studen studen = new Studen();
        studen.method();
    }


    static int count = 0;

    void animal() {
        Animal[] animals = {new Cat(), new Dog(), new Cat()};
        for (Animal a : animals) {
            if (a instanceof Cat) count++;
        }
        System.out.println(count);
    }

  /*  void plants(){
        Plant[] plant = {new Camomile(), new Rose()};
        for (Plant p: plant){
            if(p instanceof Rose){
                p.prick();
                p.smell();
            }
        }
    }*/

   /* private static int x = 100;
    public static void makeStatic(){
        Test.MyNested mySt = new MyNested();
        mySt.seeOuter();
    }
    private static class MyNested{
        public  void seeOuter(){
            System.out.println("Outer x is " + x);
        }
    }*/

    private int x = 7;

    class MyInner {
        public void seeOuter() {
            System.out.println("Outer x is " + x);
        }
    }

    void abcab() {
        String l = "ABCAB";
        System.out.println(l.startsWith("Ab"));
    }

    void abcab2() {
        String l = "ABCAB";
        System.out.print(l.indexOf("B"));
        System.out.print(l.indexOf("S"));
        System.out.print(l.indexOf("CA"));

    }

    void stringSplit() {
        String a = "One two;Two rrhe; five ;Three ree";
        Pattern p = Pattern.compile("; ");
        String[] r = p.split(a);
        for (String e : r) {
            System.out.print(e + " -  ");
        }
    }

    void stringTrimmed(){
        String space = " ";
        String comp= space + "hallo" + space + space;
        comp.concat("world");
        String tr = comp.trim();
        System.out.println(tr.length());
    }

   /* void students(){
        String[] studs = {"Ser, Jo"};
        try{
            System.out.println(studs[0]);
        }
        System.out.println(studs[1]);
        catch(ArrayIndexOutOfBoundsException){
                System.out.println("Ex")
        }
    }
*/

    void boxrPrinter() {
        BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");
        System.out.println(value2);
    }

    /*void boxrPrinter2(){
        BoxPrinter<String> value1 = new BoxPrinter<>(10);
        System.out.println( value1);
        BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");
        System.out.println( value2);
    }*/

    void utiltties() {
        Integer[] array = new Integer[2];
        Utilites.fill(array, 5);
        for (Integer s : array)
            System.out.print(s);
    }

    void genericCast() {
        Object o1 = 10;
        int i = 10;
        Integer anInteger = 10;
        Integer i1 = casts(o1);
        Integer i2 = casts(i);
        Integer i3 = casts(10);
        Integer i4 = casts(anInteger);
        System.out.println("" + i1 + i2 + i3 + i4);
    }

    void enumBase() {
        if (AnEnum.ONLY_MEM instanceof AnEnum) {
            System.out.println("yes, is AnEnum");
        }
        if (AnEnum.ONLY_MEM instanceof EnumBase) {
            System.out.println("yes, is EnumBase");
        }
        if (AnEnum.ONLY_MEM instanceof Enum) {
            System.out.println("yes, is Enum");
        }
    }

    void coffee(){
        Coffee drink = new Coffee();
        drink.size = Coffee.CoffeeSize.BIG;
        System.out.println(drink.size);
    }
    enum CoffeeSize2{BIG, HUGE,OVER}

    enum Direction{ S, N}

   /* void intGer(){
        Integer i = new Integer(5);
        i.doubleValue();
        System.out.println(i);
    }*/

    void inGer(){
        Integer i3 = 100;
        Integer i4 = 100;
        if( i3 == i4) System.out.println("same obj");
        if(i3.equals(i4))System.out.println("equal obj");
    }

    public static void main(String[] args) {
        Test test = new Test();
        //test.printOperationInc();
        //test.floated();
        //test.doWhileWhile();
        //test.class3();
        //test.arR();
        //test.outerInner();
        //test.classABC();
        //test.personStudent();
        //test.animal();
        // makeStatic();
     /*   MyInner myInner = new MyInner();
        myInner.seeOuter();*/
        //test.abcab();
        //test.abcab2();
        //test.stringSplit();
        //test.stringTrimmed();
        //test.boxrPrinter();
        //test.utiltties();
        //test.genericCast();
        //test.enumBase();
        //test.coffee();
       /* CoffeeSize2 cs = CoffeeSize2.BIG;
        System.out.println(cs);*/
        //System.out.println(CoffeeSize2.values());
       // System.out.println(Direction.valueOf(1));
        //test.intGer();
        //test.inGer();
        String s1 = "asd";
        String s2= s1;
        s1= "wwww";
        System.out.println(s1+ " " + s2);
    }

}