class DepartementFinance implements Departement {
    private double budget;

    public DepartementFinance(double budget) {
        this.budget = budget;
    }

    @Override
    public double getBudget() {
        return budget;
    }
}