import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StudenteDao dao = new StudenteDao();

        Studente s1 = new Studente(new Random().nextInt(10, 1000), "Mario", "Rossi",
                LocalDate.of(2000,6,6),TipoStudente.RESIDENTE);

        try {
            dao.salva(s1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println( (dao.getById(s1.getMatricola())));
        dao.rimuovi(1);
    }
}
