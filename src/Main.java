import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  Student studentP = new Student();

        int numberOne = 3;
        int numberTwo = 2;

        if(numberOne%2 ==0){
            Student student = new Student("Juan",2563859,20,"La margaritas",null);
            student.printStudent(student,numberOne,numberTwo);
        }else{
            Student student = new Student("Juan", 2563859);
            student.printStudent(student,numberOne,numberTwo);
        }

        //studentP.fillOutArray(numberTwo);






    }
}
