public class EmployeeTeste {
    public static void main(String[] args) {
        Employee em = new Employee( "Henrique",  "Albring", 1200.00);

        Employee em2 = new Employee("Vinicius", "Regner", 2000.00);

        System.out.println(em.salario_anual());
        System.out.println(em2.salario_anual());

        System.out.println(em.aumento__com_salario_anual(10));
        System.out.println(em2.aumento__com_salario_anual(10));
    }
}
