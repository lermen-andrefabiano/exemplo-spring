package br.com.web;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.core.acesso.Usuario;
import br.com.core.acesso.UsuarioService;

//@RequestScoped
//@ManagedBean
@Named
public class UsuarioBean {
	
	private UsuarioService usuarioService;
	
	private Usuario usuario;
	
	@Inject
	public UsuarioBean(UsuarioService usuarioService){
		this.usuarioService = usuarioService;		
	}
	
	public UsuarioBean(){
	}
	
	@PostConstruct
	private void init(){
		this.setUsuario(this.usuarioService.obterPorId("DBAMV"));
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
