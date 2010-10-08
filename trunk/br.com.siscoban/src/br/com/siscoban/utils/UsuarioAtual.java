package br.com.siscoban.utils;

import br.com.siscoban.pojos.Usuario;


public class UsuarioAtual {
	
	private static UsuarioAtual instance;
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public static UsuarioAtual getInstance() {
		if (instance == null) {
			instance = new UsuarioAtual();
		}
		return instance;
	}
	
}
