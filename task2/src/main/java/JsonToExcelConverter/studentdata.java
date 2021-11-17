package JsonToExcelConverter;

public class studentdata {

    public String Name;
    public int Age;
    public int TotalMarks;

    public studentdata( String name, int age, int totalMarks) {

        this.Name = name;
        this.Age = age;
        this.TotalMarks = totalMarks;
    }

    public studentdata() {
    }




    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getTotalMarks() {
        return TotalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.TotalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "List_Of_Students{" +
                ", name='" + Name + '\'' +
                ", age=" + Age +
                ", Total marks=" + TotalMarks +
                '}';
    }
}


