package Entitat;

import java.sql.Date;

/**
 *
 * @author Manuel Espinosa Torres
 */
public class Pet {

    private String num_id;
    private String nom;
    private Date data_naixment;
    private String chip;
    private String comentaris;
    private String historial;
    private String codi_id;
    private Date data;
    private String Tractament;
    private String especie;

    public String getNum_id() {
        return num_id;
    }

    public void setNum_id(String num_id) {
        this.num_id = num_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getData_naixment() {
        return data_naixment;
    }

    public void setData_naixment(Date data_naixment) {
        this.data_naixment = data_naixment;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getComentaris() {
        return comentaris;
    }

    public void setComentaris(String comentaris) {
        this.comentaris = comentaris;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getCodi_id() {
        return codi_id;
    }

    public void setCodi_id(String codi_id) {
        this.codi_id = codi_id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTractament() {
        return Tractament;
    }

    public void setTractament(String Tractament) {
        this.Tractament = Tractament;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
