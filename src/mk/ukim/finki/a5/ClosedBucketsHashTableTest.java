package mk.ukim.finki.a5;

public class ClosedBucketsHashTableTest {
    public static void main(String[] args) {
        ClosedBucketHashTable<ChemicalElement, Integer> table1 = new ClosedBucketHashTable<>(26);
        table1.insert(new ChemicalElement("F"), 9);
        table1.insert(new ChemicalElement("Ne"), 10);
        table1.insert(new ChemicalElement("Cl"), 17);
        table1.insert(new ChemicalElement("Ar"), 18);
        table1.insert(new ChemicalElement("Br"), 35);
        table1.insert(new ChemicalElement("Kr"), 36);
        table1.insert(new ChemicalElement("I"), 53);
        table1.insert(new ChemicalElement("Xe"), 54);
        System.out.println(table1);
        table1.delete(new ChemicalElement("F"));
        System.out.println(table1);

        ClosedBucketHashTable<ChemicalElement, Integer> table2 = new ClosedBucketHashTable<>(26);
        table2.insert(new ChemicalElement("H"), 1);
        table2.insert(new ChemicalElement("He"), 2);
        table2.insert(new ChemicalElement("Li"), 3);
        table2.insert(new ChemicalElement("Be"), 4);
        table2.insert(new ChemicalElement("Na"), 11);
        table2.insert(new ChemicalElement("Mg"), 12);
        table2.insert(new ChemicalElement("K"), 19);
        table2.insert(new ChemicalElement("Ca"), 20);
        table2.insert(new ChemicalElement("Rb"), 37);
        table2.insert(new ChemicalElement("Sr"), 38);
        table2.insert(new ChemicalElement("Cs"), 55);
        table2.insert(new ChemicalElement("Ba"), 56);
        System.out.println(table2);
        table2.delete(new ChemicalElement("H"));
        System.out.println(table2);
        System.out.println(table2.search(new ChemicalElement("Ca")));
        /*System.out.println(table2.search(new ChemicalElement("Au")));  // throws exception*/
    }
}
