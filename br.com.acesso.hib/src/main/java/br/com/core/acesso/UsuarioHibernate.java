package br.com.core.acesso;

import javax.inject.Named;

import br.com.core.acesso.Usuario;
import br.com.fwk.hibernate.AbstractCrudHibernate;

@Named
class UsuarioHibernate extends AbstractCrudHibernate<Usuario, String> implements
		UsuarioRepository {

}
