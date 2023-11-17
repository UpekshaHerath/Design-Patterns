public class Main {
    public static void main(String[] args) {
        /**
         * LIt's take an example where we have an old system that provides data in XML format, and new system that expects data
         * in JSON format.
         * We will use the adapter Pattern to make these two systems compatible without modifying their existing implementations.
         */
        OldSystem oldSystem = new OldSystem();

        Adapter adapter = new Adapter(oldSystem);

        NewSystem newSystem = new NewSystem();
        newSystem.processEmployeeDataInJSON(adapter.getEmployeeDataJSON());
    }
}
