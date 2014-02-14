package br.com.core.acesso;

import javax.inject.Inject;

import org.junit.Test;

import br.com.fwk.test.spring.AbstractSpringTest;

public class TestUsuarioHibernate extends AbstractSpringTest {

	@Inject
	private UsuarioRepository usuarioRep;	
	
	@Inject
	private UsuarioService usuarioService;	

	
	/**
	 * Busca o usúario pelo id
	 * 
	 * @author: andre.lermen
	 * 
	 */
	@Test
	public void obterPoId() {
		String usuario = "DBAMV";
		Usuario u = this.usuarioRep.obterPorId(usuario);

		if (u == null) {
			semResultado("obterPoId", "MEDICO1");
		}

		log.debug(u.getNome());
	}
	
	@Test
	public void obterPoIService() {
		String usuario = "DBAMV";
		Usuario u = this.usuarioService.obterPorId(usuario);

		if (u == null) {
			semResultado("obterPoId", "MEDICO1");
		}

		log.debug(u.getNome());
	}

	
}
