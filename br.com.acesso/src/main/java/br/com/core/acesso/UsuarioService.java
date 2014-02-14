package br.com.core.acesso;

public interface UsuarioService {

	/**
	 * Método utilizado para buscar por id um usuario - OP3052
	 * 
	 * @author alison.souza
	 * @since 04/11/2011
	 * 
	 * @param usuarioId
	 *            - Código do Usuário
	 * 
	 * @return Usuario
	 * 
	 * @throws UsuarioNaoEncontradoException
	 * @throws NegocioException
	 */
	Usuario obterPorId(String usuarioId);

}
