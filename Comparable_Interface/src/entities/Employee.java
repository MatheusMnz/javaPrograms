package entities;

public class Employee  implements  Comparable<Employee>{

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Se for maior, retorna um inteiro positivo. Se for menor, inteiro negativo. Caso seja igual, retorna zero.
    // Para inverter a ordem crescente/ Descrescente basta adicionar um "-" na frente.
    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
