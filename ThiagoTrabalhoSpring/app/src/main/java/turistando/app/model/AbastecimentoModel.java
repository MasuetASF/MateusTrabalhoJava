package turistando.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import turistando.app.controller.Enum.abastecimentoEnum;

@Entity
@Table(name="abastecimento")
public class AbastecimentoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAbastecimento;
    private double litroAbastecido;
    private double valorabastecimento;
    private abastecimentoEnum tipoabastecido;

    @OneToOne
    private VeiculoModel placa;

    public int getIdAbastecimento() {
        return idAbastecimento;
    }

    public void setIdAbastecimento(int idAbastecimento) {
        this.idAbastecimento = idAbastecimento;
    }

    public double getLitroAbastecido() {
        return litroAbastecido;
    }

    public void setLitroAbastecido(double litroAbastecido) {
        this.litroAbastecido = litroAbastecido;
    }

    public double getValorabastecimento() {
        return valorabastecimento;
    }

    public void setValorabastecimento(double valorabastecimento) {
        this.valorabastecimento = valorabastecimento;
    }

    public abastecimentoEnum getTipoabastecido() {
        return tipoabastecido;
    }

    public void setTipoabastecido(abastecimentoEnum tipoabastecido) {
        this.tipoabastecido = tipoabastecido;
    }

    public VeiculoModel getVeiculoModel() {
        return placa;
    }

    public void setVeiculoModel(VeiculoModel veiculoModel) {
        this.placa = veiculoModel;
    }

}
