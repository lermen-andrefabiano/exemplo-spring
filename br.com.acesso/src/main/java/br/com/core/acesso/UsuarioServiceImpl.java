package br.com.core.acesso;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioRepository usuarioRep;

	@Inject
	public UsuarioServiceImpl(UsuarioRepository usuarioRep) {
		this.usuarioRep = usuarioRep;
	}

	@Override
	public Usuario obterPorId(String usuarioId) {

		Usuario u = this.usuarioRep.obterPorId(usuarioId);
		if (u == null) {

		}

		return u;
	}

}
