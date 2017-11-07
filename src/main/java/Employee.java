/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
@SuppressWarnings("all")
public class Employee {

    /**
     * name of employee.
     */
    private String name;

    /**
     * manager of employee.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name Name to give the employee.
     * @param manager Manager assigned to employee.
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name employee's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name name to assign the employee.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager employee's manager.
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager assign a manager to employee.
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }
}
