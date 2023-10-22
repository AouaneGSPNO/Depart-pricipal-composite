class DepartementIT implements Departement {

        private double budget;

        public DepartementIT (double budget) {
            this.budget = budget;
        }

        @Override
        public double getBudget() {
            return budget;
        }

}
