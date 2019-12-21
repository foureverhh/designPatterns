package uml.principals.interface_segreation_principle;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is interface segregation principle");
        Searcher searcher = new Searcher();
        searcher.searchActress(new Angelababy());
        SearcherB searcherB = new SearcherB();
        System.out.println();
        searcherB.searchSuperModel(new Angelababy());
    }
}
