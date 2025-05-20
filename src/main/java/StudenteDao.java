import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//per l'accesso ai dati
//suddivide la logica di business dalla logica di accesso ai dati
//il dao conterrà tutte le istruzioni per accedere ai dati
//La logica di business è la logica che si serve dei dati per prendere decisioni su come proseguire
public class StudenteDao {
    private EntityManager em;

    public StudenteDao () {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Postgres");
        em= emf.createEntityManager();
    }

    //nel db dobbiamo salvare lo studente che gli passiamo

     public void salva(Studente studente) {
        em.getTransaction().begin(); //creiamo una transazione
         em.persist(studente); //dico al JPA di salvare lo studente sul DB
         em.getTransaction().commit(); //Salvataggio effettivo
     }

}
