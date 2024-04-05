package Ospedale;

public class Pazienti {
    String nome, cognome, triage;

    public Pazienti(String nome, String cognome, String triage){
        this.nome = nome;
        this.cognome = cognome;
        this.triage = triage;
       
    }

    public String getTriage(){
        return triage;
    }

    public void setTriage(String triage){
        this.triage = triage;
    }

    @Override
    
    public String toString(){
        return "Paziente [nome=" + nome + ", cognome=" + cognome + ", triage=" + triage + "]";
    }

}
