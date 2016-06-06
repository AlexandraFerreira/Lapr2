/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lapr.project.utils.PasswordValidator;

/**
 * Classe Utilizador, com finalidade de construção de objectos do tipo
 * Utilizador, de modo a que o sistema conheça os Utilizadores de sistema. Um
 * utilizador é uma pessoa que utiliza o sistema. A forma de identificar um
 * utilizador é através do seu username ou do seu email, dessa forma, o username
 * e o email de um utilizador só é válido se não for usado por mais nenhum
 * utilizador. Assim, pode-se dizer que o username ou o email são o id do
 * utilizador.
 *
 * @author Miguel-PC
 */
public class Utilizador {

    /**
     * O nome do utilizador.
     */
    private String nome;

    /**
     * O e-mail do utilizador.
     */
    private String email;

    /**
     * O username do utilizador.
     */
    private String userName;

    /**
     * A password do utilizador.
     */
    private String password;

    /**
     * O nome do utilizador por omissão.
     */
    private static final String NOME_POR_OMISSAO = "Sem nome";

    /**
     * O e-mail do utilizador por omissão.
     */
    private static final String EMAIL_POR_OMISSAO = "naotem@naotem.naotem";

    /**
     * O username do utilizador por omissão.
     */
    private static final String USERNAME_POR_OMISSAO = "Sem username";

    /**
     * A password do utilizador por omissão.
     */
    private static final String PASSWORD_POR_OMISSAO = "Sem password";

    /**
     * Contrói uma instância de Utilizador, no estado não registado, recebendo
     * por parâmetro o nome, o e-mail, o username e a password.
     *
     * @param sNome o nome do Utilizador
     * @param sEmail o e-mail do Utilizador
     * @param sUserName o username do Utilizador
     * @param sPassword a password do Utilizador
     */
    public Utilizador(String sNome, String sEmail, String sUserName, String sPassword) {
        setNome(sNome);
        setEmail(sEmail);
        setUsername(sUserName);
        setPassword(sPassword);
    }

    /**
     * Constrói uma instância de Utilizador com os valores por omissão.
     */
    public Utilizador() {
        nome = NOME_POR_OMISSAO;
        email = EMAIL_POR_OMISSAO;
        userName = USERNAME_POR_OMISSAO;
        password = PASSWORD_POR_OMISSAO;
    }

    /**
     * Devolve o nome do Utilizador.
     *
     * @return nome o nome do Utilizador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve o e-mail do Utilizador.
     *
     * @return email o e-mail do Utilizador
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devolve o username do Utilizador.
     *
     * @return username o username do Utilizador
     */
    public String getUsername() {
        return userName;
    }

    /**
     * Devolve a password do Utilizador.
     *
     * @return password a password do Utilizador.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifica o nome do Utilizador.
     *
     * @param nome o novo nome do Utilizador
     */
    public final void setNome(String nome) {
        if (validaNome(nome) == false) {
            throw new IllegalArgumentException("ERRO: Nome é inválido!");
        }
        this.nome = nome;
    }

    /**
     * Modifica o e-mail do Utilizador.
     *
     * @param email o novo e-mail do Utilizador
     */
    public final void setEmail(String email) {
        if (validaEmail(email) == false) {
            throw new IllegalArgumentException("ERRO: E-mail é inválido!");
        }
        this.email = email;
    }

    /**
     * Modifica o username do Utilizador.
     *
     * @param username o novo username do Utilizador
     */
    public final void setUsername(String username) {
        if (validaUsername(username) == false) {
            throw new IllegalArgumentException("ERRO: UserName é inválido!");
        }
        this.userName = username;
    }

    /**
     * Modifica a password do Utilizador.
     *
     * @param password a nova password do Utilizador
     */
    public final void setPassword(String password) {
        if (validaPassword(password) == false) {
            throw new IllegalArgumentException("ERRO: Password é inválida, "
                    + "verifique se tem pelo menos 4 caracteres!");
        }
        this.password = password;
    }

    /**
     * Devolve a descrição textual do utilizador.
     *
     * @return características do utilizador.
     */
    @Override
    public String toString() {
        return String.format("Utilizador:   Username: %s; Email: %s; Nome: %s", userName, email, nome);
    }

    /**
     * Verifica se uma instancia de Utilizador é igual a um objeto passado por
     * parâmetro.
     *
     * @param outroObjeto o objeto a comparar com o Utilizador.
     * @return true se o objeto recebido representar um utilizador equivalente
     * ao utilizador. Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        Utilizador outroUtilizador = (Utilizador) outroObjeto;

        return nome.equalsIgnoreCase(outroUtilizador.nome)
                && email.equalsIgnoreCase(outroUtilizador.email)
                && userName.equalsIgnoreCase(outroUtilizador.userName)
                && password.equalsIgnoreCase(outroUtilizador.password);
    }

    /**
     * Método de comparação, comparando o atributo userName com o userName de um
     * determinado utilizador
     *
     * @param utilizador do tipo Utilizador
     * @return
     */
    public int compareTo(Utilizador utilizador) {
        return userName.compareTo(utilizador.userName);
    }

    /**
     * Validação do nome do Utilizador.
     *
     * @param nome o nome do Utilizador
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean validaNome(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    private static Pattern pattern;
    private static Matcher matcher;

    /**
     * O padrão do e-mail.
     */
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Validação do formato do e-mail do Utilizador.
     *
     * @param email o e-mail do Utilizador
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public static boolean validaEmail(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);

        return !(email == null || email.trim().isEmpty() || !matcher.matches());
    }

    /**
     * Validação do username do Utilizador.
     *
     * @param userName o username do Utilizador
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean validaUsername(String userName) {
        return !(userName == null || userName.isEmpty());
    }

    /**
     * Verifica se a password do Utilizador é válida.
     *
     * @param password a password do Utilizador
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean validaPassword(String password) {
        if(password == null || password.isEmpty() || new PasswordValidator().validate(password) == false){
            return false;
        }
        return true;
    }

    /**
     * Valida os atributos do Utilizador.
     *
     * @return true se o objeto recebido for válido. Caso contrário, retorna
     * false.
     */
    public boolean valida() {
        System.out.println("Utilizador em validação: " + this.toString());
        return validaNome(nome) && validaUsername(userName)
                && validaPassword(password) && validaEmail(email);
    }
    
    /**
     * Constroi uma instancia cópia do Utilizador.
     * 
     * @return cópia do Utilizador
     */
    @Override
    public Utilizador clone() {
        return new Utilizador(this.getNome(), this.getEmail(), this.getUsername(), this.getPassword());
    }

}
