package br.com.core.acesso;

interface UsuarioRepository {

	/**
	 * Busca um usuário utilizando apenas o login
	 * 
	 * @author thiago.vieira
	 * @since 26/07/2011
	 * 
	 * @param login
	 *            - Código do usuário no banco
	 * @return Usuario
	 */
	Usuario obterPorId(String login);

}
