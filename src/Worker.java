public class Worker extends human{
    @Override
    public void ShowFullName() {
        System.out.println("ФИО:" + getFullName());
    }

    @Override
    public void ShowDayOfBirth() {
        System.out.println("Дата рождения: " + getDayOfBirth());
    }

    @Override
    public void ShowSalary() {
        System.out.println("Зарплата в рублях: " + getSalary());
    }
}
