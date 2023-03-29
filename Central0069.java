/*Nim			:13020210069			
Nama			:Andi Firda Januarti
Hari/Tanggal	:Rabu, 29 Maret 2023*/


interface A {
    public void aaa();
}

interface B extends A {
    // tidak perlu mendefinisikan ulang metode aaa()
}

class Central0003 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0023 obj = new Central0023();
        System.out.println("main");
        obj.aaa();
    }
}