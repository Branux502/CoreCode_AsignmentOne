import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int carne;
    private int edad;
    private String schoolName;
    private List<Integer> Notas = new ArrayList<>();

    public Student(String name, int carne) {
        this.name = name;
        this.carne = carne;
    }

    public Student(String name, int carne, int edad, String schoolName, List<Integer> notas) {
        this.name = name;
        this.carne = carne;
        this.edad = edad;
        this.schoolName = schoolName;
        Notas = notas;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(List<Integer> notas) {
        Notas = notas;
    }

    public void printStudent(Student student, int valida,int validaDos){

        if(valida%2==0){
            System.out.println("Carne: "+student.getCarne());
            System.out.println("Nombre: " + student.getName());
            System.out.println("Edad: " + student.getEdad());
            System.out.println("Nombre de Escuela: " + student.getSchoolName());
            System.out.println("Notas: " + student.getNotas());

            student.fillOutArray(student,validaDos);
        }else{
            System.out.println("Nombre: " + student.getName());
            System.out.println("Carne:" + student.getCarne());
            student.fillOutArray(student,validaDos);
        }




    }

    public void fillOutArray(Student student,int Value){

       Notas = new ArrayList<>();


        if(Value%2 == 0){
            //Es un numero par
            int conter =0;
            for(int i = 2; i <=20; i += 2){
                Notas.add(conter,i);
                System.out.println("Numeros:" + Notas.get(conter));
                conter++;
            }
        }else{
            int conter =0;
            for(int i = 1; i <=20; i +=2){
                Notas.add(conter,i);
                System.out.println("Numeros:" + Notas.get(conter));
                conter++;
            }
        }
        //System.out.println(student.getNotas());

    }


}
