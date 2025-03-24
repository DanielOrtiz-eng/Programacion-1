import java.util.Scanner;

public class Estadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        
        int MenosDe40 = 0, Entre40y50 = 0, Entre50y60 = 0, mayorIgual60 = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el peso del alumno " + i + ": ");
            double Peso = sc.nextDouble();
            if (Peso < 40)
                MenosDe40++;
            else if (Peso <= 50)
                Entre40y50++;
            else if (Peso < 60)
                Entre50y60++;
            else
                mayorIgual60++;
        }
        
        System.out.println("Alumnos de menos de 40 kg: " + MenosDe40);
        System.out.println("Alumnos entre 40 y 50 kg: " + Entre40y50);
        System.out.println("Alumnos de más de 50 kg y menos de 60 kg: " + Entre50y60);
        System.out.println("Alumnos de más o igual a 60 kg: " + mayorIgual60);
        sc.close();
    }
}
