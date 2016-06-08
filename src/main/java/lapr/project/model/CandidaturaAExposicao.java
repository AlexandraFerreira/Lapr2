/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;

/**
 * Esta classe tem como finalidade a construcao de objetos do tipo
 * CandidaturaAExposicao.
 *
 * @author Cristiano Melo
 */
public class CandidaturaAExposicao {

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
     * A lista de Produtos de uma CandidaturaAExposicao.
     */
    private ListaProdutos listProdutos;

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
     * Declaração da lista de demonstrações.
     */
    private ListaDemonstracoes listaDemos;

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
    public CandidaturaAExposicao(String nomeEmp, String morada, int telefone, double areaPretendida,
            ListaProdutos produtos, int quantConvites) {
        setNomeEmp(nomeEmp);
        setMorada(morada);
        setTelefone(telefone);
        setAreaPretendida(areaPretendida);
        setProdutos(produtos);
        setQuatConvites(quantConvites);
    }

    /**
     * Construtor vazio de Candidatura que inicia as variaveis por omissao.
     */
    public CandidaturaAExposicao() {
        this.areaPretendida = AREA_POR_OMISSAO;
        this.quatConvites = QUANT_CONVITES_POR_OMISSAO;
        this.nomeEmp = NOME_EMPRESA_POR_OMISSAO;
        this.morada = MORADA_POR_OMISSAO;
        this.listProdutos = new ListaProdutos();
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
     * @param areaPretendida a nova área de exposição pretendida pela Empresa
     */
    public void setAreaPretendida(double areaPretendida) {
        if (areaPretendida <= 0) {
            throw new IllegalArgumentException("ERRO: Àrea é inválida!");
        }
        this.areaPretendida = areaPretendida;
    }

    /**
     * Devolve a lista de produtos a expor.
     *
     * @return os produtos a expor
     */
    public ListaProdutos getProdutos() {
        return this.listProdutos;
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
     * @param quatConvites a nova quantidade de convites a adquirir
     */
    public void setQuatConvites(int quatConvites) {
        if (quatConvites <= 0) {
            throw new IllegalArgumentException("ERRO: Quantidade é inválida!");
        }
        this.quatConvites = quatConvites;
    }

    /**
     * Modifica a lista de produtos a expor.
     *
     * @param produtos os novos produtos a expor
     */
    public void setProdutos(ListaProdutos produtos) {
        //if(produtos == null || produtos.isEmpty()){
        //    throw new IllegalArgumentException("ERRO: Produtos são inválidos!");
        //}
        this.listProdutos = produtos;
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
     * @param nomeEmp o novo nome da Empresa
     */
    public void setNomeEmp(String nomeEmp) {
        if (nomeEmp == null || nomeEmp.trim().isEmpty()) {
            throw new IllegalArgumentException("ERRO: Nome é inválido!");
        }
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
     * @param morada a nova morada da Empresa
     */
    public void setMorada(String morada) {
        if (morada == null || morada.trim().isEmpty()) {
            throw new IllegalArgumentException("ERRO: Morada é inválida!");
        }
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
     * @param telefone o novo número de telemóvel da Empresa
     */
    public void setTelefone(int telefone) {
        if (telefone < 100000000 || telefone > 999999999) {
            throw new IllegalArgumentException("ERRO: Número de telemóvel é inválido!");
        }
        this.telefone = telefone;
    }

    /**
     * Devolve a descrição textual da CandidaturaAExposicao.
     *
     * @return caraterísticas da CandidaturaAExposicao.
     */
    @Override
    public String toString() {
        return String.format("Nome: %s; Morada: %s; Contacto: %d; Área Pretendida: "
                + "%.1f m2; Produtos A Expor: %s; Quantidade De Convites: %d ",
                nomeEmp, morada, telefone, areaPretendida, listProdutos, quatConvites);
    }

    /**
     * Verifica se uma instancia de CandidaturaAExposicao é igual à outra.
     *
     * @param outroObjeto o objeto a comparar com a CandidaturaAExposicao.
     * @return true se o objeto recebido representar outra CandidaturaAExposicao
     * equivalente à CandidaturaAExposicao. Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        CandidaturaAExposicao outraCandidatura = (CandidaturaAExposicao) outroObjeto;

        return nomeEmp.equalsIgnoreCase(outraCandidatura.nomeEmp)
                && morada.equalsIgnoreCase(outraCandidatura.morada)
                && telefone == outraCandidatura.telefone
                && areaPretendida == outraCandidatura.areaPretendida
                && listProdutos == outraCandidatura.listProdutos
                && quatConvites == outraCandidatura.quatConvites;
    }

    /**
     * Método que valida as demonstrações
     */
    public void validaDemonstracao() {
    }

    /**
     * Validação do nome da empresa da CandidaturaAExposicao.
     *
     * @param nome o nome da empresa da CandidaturaAExposicao
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
        System.out.println("Candidatura em validação: " + this.toString());
        if (validaNomeEmp(nomeEmp) == true || validaMorada(morada) == true
                || validaContato(telefone) || validaArea(areaPretendida) || validaQuantidade(quatConvites)) {
            return true;
        }
        return false;
    }

    /**
     * Constroi uma instancia cópia da CandidaturaAExposicao.
     *
     * @return cópia da CandidaturaAExposicao
     */
    @Override
    public CandidaturaAExposicao clone() {
        return new CandidaturaAExposicao(this.getNomeEmp(), this.getMorada(),
                this.getTelefone(), this.getAreaPretendida(), this.getProdutos(), this.getQuatConvites());
    }

    /**
     * Método que guarda a demonstração na lista de demonstrações
     *
     * @param d demonstração a adicionar à lista
     */
    public void guardarDemonstracao(Demonstracao d) {
        listaDemos.add(d);
    }

    /**
     * Método que valida a morada de uma candidatura.
     *
     * @param Morada a morada a validar
     * @return true caso seja valido, caso contrário devolve false
     */
    public boolean validaMorada(String Morada) {
        return !(morada == null || morada.trim().isEmpty() || morada.matches(".*\\d+.*"));
    }

    /**
     * Método que valida o contato de uma candidatura.
     *
     * @param telefone o número de telefone a validar
     * @return true caso seja valido, caso contrário devolve false
     */
    public boolean validaContato(int telefone) {
        return !(telefone > 100000000 & telefone < 999999999);
    }

    /**
     * Método que valida a área pretendida para a candidatura.
     *
     * @param areaPretendida a área a validar
     * @return true caso seja valido, caso contrário devolve false
     */
    public boolean validaArea(double areaPretendida) {
        return !(areaPretendida <= 0);
    }

    /**
     * Método que valida o número de convites para a candidatura.
     *
     * @param quatConvites
     * @return true caso seja valido, caso contrário devolve false
     */
    public boolean validaQuantidade(int quatConvites) {
        return !(quatConvites <= 0);
    }
}
