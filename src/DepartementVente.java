public class DepartementVente implements Departement{
    private double budget;

    public DepartementVente(double budget) {
        this.budget = budget;
    }

    @Override
    public double getBudget() {
        return budget;
    }
}
