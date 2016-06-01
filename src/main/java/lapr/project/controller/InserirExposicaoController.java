
package lapr.project.controller;

import java.util.Date;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 * A Classe CriarExposicaoController controla o registo de uma nova exposição
 * num centro de exposições.
 * 
 * @author AlexandraFerreira 1140388
 */
public class InserirExposicaoController {

    /**
     * O centro de exposições no qual se pretende registar uma nova exposição.
     */
    private CentroExposicoes centr_expos;

    /**
     * A instância de exposição a adicionar ao centro de exposições.
     */
    private Exposicao exposicao;

    /**
     * Constrói uma instância de InserirExposicaoController, passando por
     * parâmetro um centro de exposições.
     *
     * @param ce um centro de exposições
     */
    public InserirExposicaoController(CentroExposicoes ce) {
        this.centr_expos = ce;
    }

    /**
     * Inicializa o atributo exposição com uma nova instância de exposição (ao
     * centro de exposições), utilizando o construtor sem parâmetros e atributos
     * por omissão.
     */
    public void novaExposicao() {
        this.exposicao = this.centr_expos.getRegistoExposicoes().novaExposicao();
    }

    /**
     * Valida os valores para os atributos de uma exposição (passados por
     * parâmetro) e, caso estes sejam válidos, altera os atributos da exposição
     * que se pretende criar/registar, para os valores passados por parâmetro,
     * caso contrário devolve exceção com descrição informativa do erro.
     *
     * @param titulo o título da exposição
     * @param descritivo o descritivo da exposição
     * @param dataInicio a data de início da exposição
     * @param dataFim a data de fim da exposição
     * @param subInicio
     * @param subFim
     * @param local o local da exposição
     */
    public void setDados(String titulo, String descritivo, Date dataInicio, Date dataFim,
            Date subInicio, Date subFim, String local) {
        this.exposicao.setTitulo(titulo);
        this.exposicao.setDescritivo(descritivo);
        this.exposicao.setPeriodoRealizacao(dataInicio, dataFim);
        this.exposicao.setPeriodoSubmissao(subInicio, subFim);
        this.exposicao.setLocal(local);
    }

    /**
     * Devolve a lista de utilizadores do centro de exposições. Método utilizado
     * para mostrar ao gestor de exposições (que pretende criar a nova
     * exposição), quais os utilizadores do sistema que podem ser indicados como
     * organizadores da exposição.
     *
     * @return a lista de utilizadores do centro de exposições
     */
    public Utilizador getUtilizador(String userId) {
        return this.centr_expos.getRegistoUtilizadores().getUtilizador(userId);
    }

    /**
     * Adiciona um organizador ao objeto exposição, passando por parâmetro a
     * instância de Utilizador. Caso o utilizador passado por parâmetro não seja
     * válido, devolve erro.
     *
     * @param u o utilizador a adicionar à lista de organizadores de uma
     * exposição
     */
    public void addOrganizador(Utilizador u) {
        this.exposicao.getListaOrganizadores().addOrganizador(u);
    }

    /**
     * Verifica se a exposição, que se pretende adicionar ao centro de
     * exposições, é válida.
     *
     * @return true se exposição for válida, caso contrário devolve erro
     * informativo
     */
    public boolean validaExposicao() {
        return this.centr_expos.getRegistoExposicoes().validaExposicao(exposicao);
    }

    /**
     * Regista uma nova exposição num centro de exposições, se a exposição for
     * válida, caso contrário devolve false.
     *
     * @return true se exposição for válida (adicionando-a ao centro de
     * exposições) ou false caso não seja válida
     */
    public void registaExposicao() {
         this.centr_expos.getRegistoExposicoes().registaExposicao(exposicao);
    }
}
