package RestauranteEDoBem;

import java.util.ArrayList;
import java.util.List;

public class Prato {

    //Atributos
    private String prato;
    private List<Prato> pratoList = new ArrayList<>();

    //Método construtor

    public Prato(String prato, List<Prato> pratoList) {
        this.prato = prato;
        this.pratoList = pratoList;
    }

    //Método Getters e Setters


    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public List<Prato> getPratoList() {
        return pratoList;
    }

    public void setPratoList(List<Prato> pratoList) {
        this.pratoList = pratoList;
    }
}
