import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StudenteDao dao = new StudenteDao();

        Studente s1 = new Studente(1,"Mario", "Rossi",
                LocalDate.of(2000,6,6),TipoStudente.RESIDENTE);

        try {
            dao.salva(s1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
