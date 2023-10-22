import java.util.ArrayList;
import java.util.List;

class DepartementPrincipal implements Departement {
    private List<Departement> subDepartments = new ArrayList<>();

    public void addSubDepartment(Departement subDepartment) {
        subDepartments.add(subDepartment);
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (Departement subDepartment : subDepartments) {
            totalBudget += subDepartment.getBudget();
        }
        return totalBudget;
    }
}
