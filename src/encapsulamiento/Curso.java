package encapsulamiento;

public class Curso {

    private String nombreCurso;
    private double nota1;
    private double nota2;
    private double nota3;

    public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
        this.nombreCurso = nombreCurso;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 100) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 100) {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 100) {
            this.nota3 = nota3;
        }
    }

    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String estado() {
        return promedio() >= 61 ? "Aprobado" : "Reprobado";
    }
}