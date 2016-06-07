package lapr.project.model;

import lapr.project.date.Data;

/**
 * A classe Exposição conta com varios atributos alguns deles associados a
 * outras classes. Esta classe representa na sua essencia o negócio, pois este
 * sistema trata-se sobre gestão de exposições.
 *
 * @author AlexandraFerreira 1140388
 */
public class Exposicao {

    /**
     * O título da Exposição.
     */
    private String titulo;

    /**
     * O texto descritivo sobre o âmbito da Exposição.
     */
    private String text_descritivo;

    /**
     * A data de início da Exposição.
     */
    private Data dataInicio;

    /**
     * A data de fim da Exposição.
     */
    private Data dataFim;

    /**
     * A data de submissão de início da Exposição.
     */
    private Data subInicio;

    /**
     * A data de submissão de fim da Exposição.
     */
    private Data subFim;

    /**
     * O local da realização da Exposição.
     */
    private String local;

    /**
     * A lista de pessoas responsáveis pela realização da Exposição.
     */
    ListaOrganizadores lista_Organizadores;

    /**
     * Registo de candidaturas da Exposição.
     */
    private RegistoCandidatura registoCandidatura;

    /**
     * O título da Exposição por omissão.
     */
    private static final String TITULO_POR_OMISSAO = "Sem título";

    /**
     * O texto descritivo sobre o âmbito da Exposição por omissão.
     */
    private static final String DESCRITIVO_POR_OMISSAO = "Sem texto descritivo";

    /**
     * A data de início da Exposição por omissão.
     */
    private static final Data DATA_INICIO_POR_OMISSAO = Data.dataAtual();

    /**
     * A data de fim da Exposição por omissão.
     */
    private static final Data DATA_FIM_OMISSAO = Data.dataAtual();

    /**
     * A data de submissão de início da Exposição por omissão.
     */
    private static final Data DATA_SUBMISSAO_INICIO_POR_OMISSAO = Data.dataAtual();

    /**
     * A data de submissão de fim da Exposição por omissão.
     */
    private static final Data DATA_SUBMISSAO_FIM_OMISSAO = Data.dataAtual();

    /**
     * O local da realização da Exposição por omissão.
     */
    private static final String LOCAL_POR_OMISSAO = "Sem local";
    /**
     * Declaração da variável lista de demonstrações
     */
    ListaDemonstracoes lista_Demonstracoes;
    /**
     * Constrói uma instância de Exposição com todos os valores "vazios".
     */
    
    public Exposicao() {
        setTitulo(TITULO_POR_OMISSAO);
        setDescritivo(DESCRITIVO_POR_OMISSAO);
        setPeriodoRealizacao(DATA_INICIO_POR_OMISSAO, DATA_FIM_OMISSAO);
        setPeriodoSubmissao(DATA_SUBMISSAO_INICIO_POR_OMISSAO, DATA_SUBMISSAO_FIM_OMISSAO);
        setLocal(LOCAL_POR_OMISSAO);
        this.lista_Organizadores = new ListaOrganizadores();

    }

    /**
     * Constrói uma instância de Exposição recebendo o título, o texto
     * descritivo, a data de início, a data de fim e o local por parâmetro.
     *
     * @param titulo o título da Exposição
     * @param text_descritivo o texto descritivo sobre o âmbito da Exposição
     * @param dataInicio a data de início da Exposição
     * @param dataFim a data de fim da Exposição
     * @param local o local da realização da Exposição
     */
    public Exposicao(String titulo, String text_descritivo, Data dataInicio, Data dataFim, String local) {
        setTitulo(titulo);
        setDescritivo(text_descritivo);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setLocal(local);
        this.lista_Demonstracoes = new ListaDemonstracoes();
    }

    /**
     * Constrói uma instância de Exposição recebendo o título, o texto
     * descritivo, a data de início, a data de fim, a data de início de
     * submissão, a data de fim de submissão e o local por parâmetro.
     *
     * @param titulo o título da Exposição
     * @param text_descritivo o texto descritivo sobre o âmbito da Exposição
     * @param dataInicio a data de início da Exposição
     * @param dataFim a data de fim da Exposição
     * @param subInicio a data de início de submissão da Exposição
     * @param subFim a data de fim de submissão da Exposição
     * @param local o local da realização da Exposição
     */
    public Exposicao(String titulo, String text_descritivo, Data dataInicio, Data dataFim,
            Data subInicio, Data subFim, String local) {
        setTitulo(titulo);
        setDescritivo(text_descritivo);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setDataSubInicio(subInicio);
        setDataSubFim(subFim);
        setLocal(local);
    }

    /**
     * Devolve o Registo de Candidaturas.
     *
     * @return Registo de Candidaturas.
     */
    public RegistoCandidatura getRegistoCandidaturas() {
        return registoCandidatura;
    }

    /**
     * Devolve o título da Exposição.
     *
     * @return o título da Exposição
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devolve o texto descritivo da Exposição.
     *
     * @return o texto descritivo da Exposição
     */
    public String getDescritivo() {
        return text_descritivo;
    }

    /**
     * Devolve a data de início da Exposição.
     *
     * @return a data de início da Exposição
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a data de fim da Exposição.
     *
     * @return a data de fim da Exposição
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     * Devolve a data de submissão de início da Exposição.
     *
     * @return a data de submissão de início da Exposição
     */
    public Data getSubInicio() {
        return subInicio;
    }

    /**
     * Devolve a data de submissão de fim da Exposição.
     *
     * @return a data de submissão de fim da Exposição
     */
    public Data getSubFim() {
        return subFim;
    }

    /**
     * Devolve o local da Exposição.
     *
     * @return o local da Exposição
     */
    public String getLocal() {
        return local;
    }

    /**
     * Devolve a lista de organizadores da Exposição.
     *
     * @return a lista de organizadores da Exposição
     */
    public ListaOrganizadores getListaOrganizadores() {
        return lista_Organizadores;
    }

    /**
     * Modifica o título da Exposição.
     *
     * @param titulo o novo título da Exposição
     */
    public final void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("ERRO: Título é inválido!");
        }
        this.titulo = titulo;
    }

    /**
     * Modifica o texto descritivo da Exposição.
     *
     * @param text_descritivo o novo texto descritivo da Exposição
     */
    public final void setDescritivo(String text_descritivo) {
        if (text_descritivo == null || text_descritivo.trim().isEmpty()) {
            throw new IllegalArgumentException("ERRO: Texto descritivo é inválido!");
        }
        this.text_descritivo = text_descritivo;
    }

    /**
     * Modifica a data de início da Exposição.
     *
     * @param dtInicio a nova data de início da Exposição
     */
    public final void setDataInicio(Data dtInicio) {
        if (dtInicio == null) {
            throw new IllegalArgumentException("ERRO: Data de início é inválida!");
        }
        this.dataInicio = dtInicio;
    }

    /**
     * Modifica a data de fim da Exposição.
     *
     * @param dtFim a nova data de fim da Exposição
     */
    public final void setDataFim(Data dtFim) {
        if (dtFim == null) {
            throw new IllegalArgumentException("ERRO: Data de fim é inválida!");
        }
        this.dataFim = dtFim;
    }

    /**
     * Modifica o período da Exposição recebendo por parâmetro a data de início
     * e a data de fim.
     *
     * @param dtInicio a nova data de início da Exposição
     * @param dtFim a nova data de fim da Exposição
     */
    public final void setPeriodoRealizacao(Data dtInicio, Data dtFim) {
        this.setDataInicio(dtInicio);
        this.setDataFim(dtFim);
    }

    /**
     * Modifica a data de início de submissão da Exposição.
     *
     * @param subInicio a nova data de início de submissão da Exposição
     */
    public final void setDataSubInicio(Data subInicio) {
        if (subInicio == null) {
            throw new IllegalArgumentException("ERRO: Data de início de submissão é inválida!");
        }
        this.subInicio = subInicio;
    }

    /**
     * Modifica a data de fim de submissão da Exposição.
     *
     * @param subFim a nova data de fim de submissão da Exposição
     */
    public final void setDataSubFim(Data subFim) {
        if (subFim == null) {
            throw new IllegalArgumentException("ERRO: Data de fim de submissão é inválida!");
        }
        this.subFim = subFim;
    }

    /**
     * Modifica o período de submissão da Exposição recebendo por parâmetro a
     * data de início e a data de fim.
     *
     * @param subInicio a nova data de início de submissão da Exposição
     * @param subFim a nova data de fim de submissão da Exposição
     */
    public final void setPeriodoSubmissao(Data subInicio, Data subFim) {
        this.setDataSubInicio(subInicio);
        this.setDataSubFim(subFim);
    }

    /**
     * Modifica o local da Exposição.
     *
     * @param local o novo local da Exposição
     */
    public final void setLocal(String local) {
        if (local == null || local.trim().isEmpty()) {
            throw new IllegalArgumentException("ERRO: Local é inválido!");
        }
        this.local = local;
    }
    
    /**
     * Modifica a Lista de Organizadores.
     *
     * @param lo a lista de Organizadores
     */
    public void setListaOrganizadores(ListaOrganizadores lo) {
        lista_Organizadores = lo;
    }
    
    /**
     * Modifica a Lista de Demonstracoes.
     *
     * @param ld a lista de Demonstracoes
     */
    public void setListaDemonstracoes(ListaDemonstracoes ld) {
        lista_Demonstracoes = ld;
    }

    /**
     * Devolve a descrição textual da Exposição.
     *
     * @return caraterísticas da Exposição.
     */
    @Override
    public String toString() {
        String sTxt;
        sTxt = String.format("Título: %s; Texto Descritivo: %s; Data de Início: %s;"
                + " Data de Fim: %s; Local: %s.\nOrganizadores:\n",
                this.titulo, this.text_descritivo, this.dataInicio.toDiaMesAnoString(),
                this.dataFim.toDiaMesAnoString(), this.local);

        for (Organizador org : this.lista_Organizadores.getListaOrganizadores()) {
            sTxt += String.format("%s \n", org.toString());
        }

        return sTxt;
        }

    /**
     * Método que valida a Exposição.
     *
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean valida() {
        return lista_Organizadores.valida();
    }

    /**
     * Verifica se uma instância de Exposição é igual à outra.
     *
     * @param outroObjeto o objeto a comparar com a Exposição.
     * @return true se o objeto recebido representar outra Exposição equivalente
     * à Exposição. Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        Exposicao outraExposicao = (Exposicao) outroObjeto;

        return titulo.equalsIgnoreCase(outraExposicao.titulo)
                && text_descritivo.equalsIgnoreCase(outraExposicao.text_descritivo)
                && dataInicio == outraExposicao.dataInicio
                && dataFim == outraExposicao.dataFim
                && local.equalsIgnoreCase(outraExposicao.local)
                && lista_Organizadores == outraExposicao.lista_Organizadores;
    }

    /**
     * Método que cria uma candidatura mas na exposição limita-se a criar uma
     * instância deregistocandidatura para poder cria a candidatura propriamente
     *
     * @return registo de candidatura
     */
    public RegistoCandidatura criarCandidatura() {
        RegistoCandidatura rc = new RegistoCandidatura();
        return rc;
    }
        /**
     * Métod que permite devolver a lista de demonstracoes
     *
     * @return a lista de demonstrações
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return lista_Demonstracoes;
    }
    public String toStringExpo() {
        String sTxt;
        sTxt = String.format("Título: %s; Texto Descritivo: %s; Data de Início: %s;"
                + " Data de Fim: %s; Local: %s.",
                this.titulo, this.text_descritivo, this.dataInicio.toDiaMesAnoString(),
                this.dataFim.toDiaMesAnoString(), this.local);

        return sTxt;
        }
}
