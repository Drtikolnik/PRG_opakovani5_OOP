public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Karel Havlíček", 3, 2.5);
        Student s2 = new Student("Karel Čapek", 2, 1.3);
        Student s3 = new Student("Karel Čapek", 2, 1.3);


        if(s2.equals(s2, s3)){
            System.out.println("ROVNAJÍ SE");
        }else{
            System.out.println("NEROVNAJÍ SE");
        }

        s1.klasifikace();
        s1.zlepsiPrmer(0.5);
        s1.zlepsiPrmer(0.5);
        System.out.println(s1.getPrumer());
        s1.klasifikace();



    }
}