
package lapr.project.model;

/**
 * Esta Classe representa um Organizador, pessoa reponsável pela realização de 
 * uma exposição, desempenhando entre outras tarefas:
 * - a definição dos funcionários de apoio à exposição (FAE) da qual é organizador;
 * - atribuição aos FAE das candidaturas dos expositores, para decisão.
 * Um organizador é necessáriamente um utilizador registado no sistema, portanto
 * esta classe tem um atributo do tipo Utilizador. Sendo que este é identificado 
 * pelo username ou email de utilizador, que são únicos no sistema.
 * 
 * @author AlexandraFerreira 1140388
 */
public class Organizador {

    /**
     * O utilizador de um Organizador.
     */
    private Utilizador utilizador;

    /**
     * Contrói uma instância de Organizador recebendo por parâmetro o
     * utilizador.
     *
     * @param utilizador o utilizador de um Organizador
     */
    public Organizador(Utilizador utilizador) {
        setUtilizador(utilizador);
    }

    /**
     * Constroi uma instância de Organizador com todos os valores "vazios".
     */
    public Organizador() {
    }

    /**
     * Devolve o utilizador de um Organizador.
     *
     * @return utilizador o utilizador
     */
    public Utilizador getUtilizador() {
        return this.utilizador;
    }

    /**
     * Modifica o utilizador de um Organizador.
     *
     * @param u o novo utilizador de um Organizador
     */
    public final void setUtilizador(Utilizador u) {
        this.utilizador = u;
        if (valida() == false) {
            throw new IllegalArgumentException("ERRO: Utilizador é inválido!");
        }
    }

    /**
     * Validação do Organizador.
     *
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean valida() {
        if (utilizador.valida()==true) {
            System.out.println("Organizador em validação: " + this.toString());
            return true;
        }
        return false;
    }

    /**
     * Devolve a descrição textual do Organizador.
     *
     * @return caraterísticas do Organizador.
     */
    @Override
    public String toString() {
        return String.format("Organizador:   %s", this.utilizador.toString());
    }

    /**
     * Método que verifica se um Organizador corresponde ao utilizador passado
     * por parâmetro.
     *
     * @param u o utilizador com o qual se pretende comparar o utilizador de um
     * organizador
     * @return true caso seja o organizador corresponda ao utilizador passado
     * por parâmetro. Caso contrário devolve false.
     */
    public boolean isUtilizador(Utilizador u) {
        if (this.utilizador != null) {
            return this.utilizador.equals(u);
        }
        return false;
    }

    /**
     * Verifica se uma instância de Organizador é igual a outro objeto passado
     * como parâmetro.
     *
     * @param outroObjeto o objeto a comparar com o Organizador.
     * @return true se o objeto recebido representar um Organizador equivalente.
     * Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        Organizador outroOrganizador = (Organizador) outroObjeto;

        return this.getUtilizador().equals(outroOrganizador.getUtilizador());

    }

}
