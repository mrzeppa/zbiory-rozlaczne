public class Main {

    public static void main(String[] args) {

        Node tab[] = new Node[10];

        DisjointSet dsj = new DisjointSet();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = dsj.make(i);
        }

        dsj.union(dsj.find(tab[0]), dsj.find(tab[1]));
        dsj.union(dsj.find(tab[2]), dsj.find(tab[3]));
        dsj.union(dsj.find(tab[1]), dsj.find(tab[2]));
        dsj.union(dsj.find(tab[5]), dsj.find(tab[6]));
        dsj.union(dsj.find(tab[7]), dsj.find(tab[8]));
        dsj.union(dsj.find(tab[3]), dsj.find(tab[5]));
        dsj.union(dsj.find(tab[0]), dsj.find(tab[7]));


        for (int i = 0; i < tab.length; i++) {
            dsj.path(tab[i]);
            System.out.println("====================");
        }

    }
}