import jakarta.persistence.*;

import java.time.LocalDate;

//SALVIAMO NEL DATABASE
@Entity
// serve al JPA per capire che deve avere una corrispondenza in una tabella

@Table(name = "studenti ") //ANDIAMO A DARE UN NOME DIVERSO RISPETTO ALLA CLASSE
public class Studente {
    @Id //CHIAVE PRINCIPALE MATRICOLA
    private int matricola;

    @Column(length = 20, nullable = false) //impostiamo una lunghezza max di 20 e impostiamo il not null
    private String nome;
    @Column(length = 20, nullable = false)
    private String cognome;

    @Column (name = "data_nascita")
    private LocalDate dataNascita;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_studente") // gli diamo uno snake case con l'underscore
    private TipoStudente tipoStudente;

    public Studente(TipoStudente tipoStudente, LocalDate dataNascita, String cognome, String nome, int matricola) {
        this.tipoStudente = tipoStudente;
        this.dataNascita = dataNascita;
        this.cognome = cognome;
        this.nome = nome;
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public TipoStudente getTipoStudente() {
        return tipoStudente;
    }

    public void setTipoStudente(TipoStudente tipoStudente) {
        this.tipoStudente = tipoStudente;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola=" + matricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", tipoStudente=" + tipoStudente +
                '}';
    }
}
