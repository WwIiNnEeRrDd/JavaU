public class Estudiantes {

    private String name;
    private String password;
    private float grades[];

    public Estudiantes(String n, String p, float[] g) {
        this.name = n;
        this.password = p;
        this.grades = g;
    }

    public String getNombre() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public float[] getGrades() {
        return grades;
    }

}
