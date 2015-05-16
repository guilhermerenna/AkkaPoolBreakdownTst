package factorial;

public class FactorialApp {

    public static void main(String[] args) {
        // starting 3 backend nodes and 1 frontend node
        System.err.println("Iniciando Backend 1 em 2551.");
        FactorialBackendMain.main(new String[]{"2551"});
        System.err.println("Iniciando Backend 2 em 2552.");
        FactorialBackendMain.main(new String[]{"2552"});
        System.err.println("Iniciando Frontend em random.");
        FactorialFrontendMain.main(new String[0]);
        System.err.println("Cluster up!!");
    }
}
