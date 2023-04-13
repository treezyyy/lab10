public abstract class human {

    private String FullName;
    private String DayOfBirth;
    private Integer Salary;

    public abstract void ShowFullName();
    public abstract void ShowDayOfBirth();
    public abstract void ShowSalary();

    public String getFullName(){
        return FullName;
    }

    public void setFullName(String FullName){
        this.FullName = FullName;
    }

    public String getDayOfBirth(){
        return DayOfBirth;
    }

    public void setDayOfBirth(String DayOfBirth){
        this.DayOfBirth = DayOfBirth;
    }

    public Integer getSalary(){
        return Salary;
    }

    public void setSalary(int Salary){
        this.Salary = Salary;
    }


}
