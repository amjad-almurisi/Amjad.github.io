public class student {
    int id ;
    String nmae ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public student(int id, String nmae) {
        this.id = id;
        this.nmae = nmae;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", nmae='" + nmae + '\'' +
                '}';
    }
}
