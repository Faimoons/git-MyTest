public class Main {

    public static void main(String[] args) {
        Integer[][] h = {{},{123, 345},{},{},{},{}, {234, 25}};
        Realis2<Integer> mass2 = new Realis2<>();
        mass2.setArray(h);
        while (mass2.hasNext()) {
            System.out.println(mass2.next());
        }
       // Integer[][] h = {{1234, 345, 2623},{456},{234, 25}};
       // Realis3<Integer> mass2 = new Realis3<>(h);
       // mass2.setArray(h);
//        Realis3<Integer> c = new Realis3<>();
//        c.setArray(h);
//        Iterator<Integer> it =  c.getIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
            //System.out.println(c.getIterator().next());

        //        Integer[] g = {13, 45, 7, 78};
//        Realis<Integer> mass = new Realis<>();
//        mass.setArray(g);
//        while (mass.hasNext()) {
//            Integer i = mass.next();
//            System.out.println(i);
//        }

    }
}