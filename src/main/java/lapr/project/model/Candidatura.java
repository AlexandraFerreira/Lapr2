/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Esta classe tem como finalidade a construcao de objetos do tipo Candidatura.
 *
 * @author Cristiano Melo
 */
public class Candidatura {

    /**
     * Declaracao da variavel com area Pretendida.
     */
    private double areaPretendida;
    
    /**
     * Declaracao da variavel com a quantidade de convites.
     */
    private int quatConvites;
    
    /**
     * Declaracao da variavel com o nome da empresa.
     */
    private String nomeEmp;
    
    /**
     * Declaracao da variavel com a morada.
     */
    private String morada;
    
    /**
     * Declaracao da variavel com o telefone.
     */
    private int telefone;

    /**
     * Declaracao da variavel area por omissao.
     */
    private static double AREA_POR_OMISSAO = 0;

    /**
     * Declaracao da variavel quantidade de convites por omissao.
     */
    private static int QUANT_CONVITES_POR_OMISSAO = 0;

    /**
     * Declaracao da variavel empresa por omissao.
     */
    private static String NOME_EMPRESA_POR_OMISSAO = "Sem nome";

    /**
     * Declaracao da variavel area por omissao.
     */
    private static String MORADA_POR_OMISSAO = "Sem morada";

    /**
     * Declaracao da variavel telefone por omissao.
     */
    private static int TELEFONE_POR_OMISSAO = 220000000;

    /**
     * Construtor completo que inicia a Candidatura com todos os elementos da
     * classe Candidatura.
     *
     * @param areaPretendida variavel que indica a area pretendida.
     * @param quantConvites variavel que indica a quantidade de convites.
     * @param nomeEmp variavel que indica o nome da empresa.
     * @param morada variavel que indica a morada da empresa.
     * @param telefone variavel que indica telemovel da empresa.
     */
    public Candidatura(String nomeEmp, String morada, int telefone, double areaPretendida, int quantConvites) {
        setNomeEmp(nomeEmp);
        setMorada(morada);
        setTelefone(telefone);
        setAreaPretendida(areaPretendida);
        setQuatConvites(quantConvites);
    }

    /**
     * Construtor vazio de Candidatura que inicia as variaveis por omissao.
     */
    public Candidatura() {
        this.areaPretendida = AREA_POR_OMISSAO;
        this.quatConvites = QUANT_CONVITES_POR_OMISSAO;
        this.nomeEmp = NOME_EMPRESA_POR_OMISSAO;
        this.morada = MORADA_POR_OMISSAO;
        this.telefone = TELEFONE_POR_OMISSAO;
    }

    /**
     * Metodo getAreaPretendida que retorna a area pretendida.
     *
     * @return
     */
    public double getAreaPretendida() {
        return areaPretendida;
    }

    /**
     * Metodo setAreaPretendida que permite alterar a area pretendida.
     *
     * @param areaPretendida
     */
    public void setAreaPretendida(double areaPretendida) {
        this.areaPretendida = areaPretendida;
    }

    /**
     * Metodo getQuantConvites que retorna a quantidade de convites.
     *
     * @return
     */
    public int getQuatConvites() {
        return quatConvites;
    }

    /**
     * Metodo setQuatConvites que permite alterar a quantidade de convites.
     *
     * @param quatConvites
     */
    public void setQuatConvites(int quatConvites) {
        this.quatConvites = quatConvites;
    }
    
    public void setProdutos(Produto produtos) {
    }
    
    public void setDemonstracoes(Demonstracao demo) {
    }

    /**
     * Metodo getNomeEmp que retorna o nome da empresa.
     *
     * @return
     */
    public String getNomeEmp() {
        return nomeEmp;
    }

    /**
     * Metodo setNomeEmp que permite alterar o nome da empresa.
     *
     * @param nomeEmp
     */
    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    /**
     * Metodo getMorada que retorna a Morada.
     *
     * @return
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Metodo setMorada que permite alterar a morada.
     *
     * @param morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Metodo getTelefone que retorna o telefone.
     *
     * @return
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * Metodo setTelefone que permite alterar o telefone.
     *
     * @param telefone
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Método que valida as demonstrações
     */
    public void validaDemonstracao() {
    }
    
    /**
     * Validação do nome da empresa da Candidatura.
     *
     * @param nome o nome da empresa da Candidatura
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean validaNomeEmp(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }
    
    /**
     * Valida os atributos do Utilizador.
     *
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean valida() {
        System.out.println("Utilizador em validação: " + this.toString());
        return validaNomeEmp(nomeEmp);
    }

    /**
     * Constroi uma instancia cópia da Candidatura.
     * 
     * @return cópia da Candidatura
     */
    @Override
    public Candidatura clone() {
        return new Candidatura(this.getNomeEmp(), this.getMorada(), 
                this.getTelefone(), this.getAreaPretendida(), this.getQuatConvites());
    }
}
