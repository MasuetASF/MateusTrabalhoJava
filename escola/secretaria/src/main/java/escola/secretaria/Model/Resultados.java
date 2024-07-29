package escola.secretaria.Model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Resultados")
public class Resultados implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRES")
    private long idRes;

    @OneToOne
    @JoinColumn(name = "matricula")
    private Aluno matricula;

    @OneToOne
    @JoinColumn(name = "IdDisciplina")
    private DisciplinasModel idDis;

    @Column(name  = "PriNota")
    private double priNota;

    @Column(name  = "SegNota")
    private double segNota;

    public double getPriNota() {
        return priNota;
    }

    public void setPriNota(double priNota) {
        this.priNota = priNota;
    }

    public double getSegNota() {
        return segNota;
    }

    public void setSegNota(double segNota) {
        this.segNota = segNota;
    }

    public double getTerNota() {
        return terNota;
    }

    public void setTerNota(double terNota) {
        this.terNota = terNota;
    }

    public double getQuaNota() {
        return quaNota;
    }

    public void setQuaNota(double quaNota) {
        this.quaNota = quaNota;
    }

    public double getMedia() {
        return media;
    }
    public void resultado(double pri, double seg, double ter, double qua){
        double media = 0.0;
        media = (pri + seg + ter + qua)/4;
        setMedia(media);
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Column(name  = "TerNota")
    private double terNota;

    @Column(name  = "QuaNota")
    private double quaNota;

    @Column(name  = "Media")
    private double media;


    public long getIdRes() {
        return idRes;
    }

    public void setIdRes(long idRes) {
        this.idRes = idRes;
    }

    public Aluno getMatricula() {
        return matricula;
    }

    public void setMatricula(Aluno matricula) {
        this.matricula = matricula;
    }

    public DisciplinasModel getIdDis() {
        return idDis;
    }

    public void setIdDis(DisciplinasModel idDis) {
        this.idDis = idDis;
    }

}
