
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A classe Exposição conta com varios atributos alguns deles associados
 * a outras classes. Esta classe representa na sua essencia o negócio,
 * pois este sistema trata-se sobre gestão de exposições.
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
    private Date dataInicio;

    /**
     * A data de fim da Exposição.
     */
    private Date dataFim;
    
    /**
     * A data de submissão de início da Exposição.
     */
    private Date subInicio;

    /**
     * A data de submissão de fim da Exposição.
     */
    private Date subFim;

    /**
     * O local da realização da Exposição.
     */
    private String local;

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
    private static final Date DATA_INICIO_POR_OMISSAO = new Date(System.currentTimeMillis());

    /**
     * A data de fim da Exposição por omissão.
     */
    private static final Date DATA_FIM_OMISSAO = new Date(System.currentTimeMillis());
    
    /**
     * A data de submissão de início da Exposição por omissão.
     */
    private static final Date DATA_SUBMISSAO_INICIO_POR_OMISSAO = new Date(System.currentTimeMillis());

    /**
     * A data de submissão de fim da Exposição por omissão.
     */
    private static final Date DATA_SUBMISSAO_FIM_OMISSAO = new Date(System.currentTimeMillis());

    /**
     * O local da realização da Exposição por omissão.
     */
    private static final String LOCAL_POR_OMISSAO = "Sem local";

    /**
     * Constrói uma instância de Exposição com todos os valores "vazios".
     */
    public Exposicao() {
        setTitulo(TITULO_POR_OMISSAO);
        setDescritivo(DESCRITIVO_POR_OMISSAO);
        setPeriodoRealizacao(DATA_INICIO_POR_OMISSAO, DATA_FIM_OMISSAO);
        setLocal(LOCAL_POR_OMISSAO);
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
    public Exposicao(String titulo, String text_descritivo, Date dataInicio, Date dataFim, String local) {
        setTitulo(titulo);
        setDescritivo(text_descritivo);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setLocal(local);      
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
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a data de fim da Exposição.
     *
     * @return a data de fim da Exposição
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * Devolve a data de submissão de início da Exposição.
     *
     * @return a data de submissão de início da Exposição
     */
    public Date getSubInicio() {
        return subInicio;
    }

    /**
     * Devolve a data de submissão de fim da Exposição.
     *
     * @return a data de submissão de fim da Exposição
     */
    public Date getSubFim() {
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
    public List<Organizador> getListaOrganizadores() {
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
    public final void setDataInicio(Date dtInicio) {
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
    public final void setDataFim(Date dtFim) {
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
    public final void setPeriodoRealizacao(Date dtInicio, Date dtFim) {
        this.setDataInicio(dtInicio);
        this.setDataFim(dtFim);
    }

    /**
     * Modifica a data de submissão de início da Exposição.
     *
     * @param subInicio a nova data de submissão de início da Exposição
     */
    public final void setDataSubInicio(Date subInicio) {
        if (subInicio == null) {
            throw new IllegalArgumentException("ERRO: Data de início é inválida!");
        }
        this.subInicio = subInicio;
    }
    
    /**
     * Modifica a data de submissão de fim da Exposição.
     *
     * @param subFim a nova data  de fim da Exposição
     */
    public final void setDataSubFim(Date subFim) {
        if (subFim == null) {
            throw new IllegalArgumentException("ERRO: Data de fim é inválida!");
        }
        this.subFim = subFim;
    }
    
    /**
     * Modifica o período de submissão da Exposição recebendo por parâmetro a data de início
     * e a data de fim.
     *
     * @param subInicio a nova data de submissão de início da Exposição
     * @param subFim a nova data de submissão de fim da Exposição
     */
    public final void setPeriodoSubmissao(Date subInicio, Date subFim) {
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
     * Devolve a descrição textual da Exposição.
     *
     * @return caraterísticas da Exposição.
     */
    @Override
    public String toString() {
        String sTxt;
        sTxt = String.format("Título: %s; Texto Descritivo: %s; Data de Início: %s;"
                + " Data de Fim: %s; Local: %s.\nOrganizadores:\n",
                this.titulo, this.text_descritivo,
                lapr.project.utils.Utils.mostrarDataFormato_DIA_MES_ANO(this.dataInicio),
                lapr.project.utils.Utils.mostrarDataFormato_DIA_MES_ANO(this.dataFim),
                this.local);

        for (Organizador org : this.lista_Organizadores) {
            sTxt += String.format("%s \n", org.toString());
        }

        return sTxt;
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
}
