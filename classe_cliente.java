/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author josue
 */
public class classe_cliente {
    
    private int id;

    public static final String PROP_ID = "id";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private String cpfcnpj;

    public static final String PROP_CPFCNPJ = "cpfcnpj";

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        String oldCpfcnpj = this.cpfcnpj;
        this.cpfcnpj = cpfcnpj;
        propertyChangeSupport.firePropertyChange(PROP_CPFCNPJ, oldCpfcnpj, cpfcnpj);
    }

    private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    private String ativo;

    public static final String PROP_ATIVO = "ativo";

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        String oldAtivo = this.ativo;
        this.ativo = ativo;
        propertyChangeSupport.firePropertyChange(PROP_ATIVO, oldAtivo, ativo);
    }

    private float valor;

    public static final String PROP_VALOR = "valor";

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        float oldValor = this.valor;
        this.valor = valor;
        propertyChangeSupport.firePropertyChange(PROP_VALOR, oldValor, valor);
    }

}
