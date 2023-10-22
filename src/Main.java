public class Main {
    public static void main(String[] args) {
        DepartementPrincipal departementPrincipal = new DepartementPrincipal();

        Departement fin = new DepartementFinance(70000.0);
        Departement ventes = new DepartementVente(67000.0);
        Departement it = new DepartementIT(110000.0);

        // Ajouter des sousdéparts au départ principal
        departementPrincipal.addSubDepartment(fin);
        departementPrincipal.addSubDepartment(ventes);
        departementPrincipal.addSubDepartment(it);

        // Calculer budget global
        double totalBudget = departementPrincipal.getBudget();
        System.out.println("************ Budget total  ***************");
        System.out.println(" \n ====> budget :  " + totalBudget);
    }
}
