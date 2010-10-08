package br.com.siscoban.models;

import java.util.List;

import org.hibernate.Session;

import br.com.siscoban.daos.UsuarioDAO;
import br.com.siscoban.pojos.Usuario;
import br.com.siscoban.utils.DefaultException;
import br.com.siscoban.utils.HibernateUtil;

public class ModelLogin {
	

	public void usuarioOk( Usuario usuario ) throws DefaultException {
		
		Session session = new HibernateUtil().getSession();
		UsuarioDAO usuarioDAO = new UsuarioDAO(session);
		
		List<Usuario> users = usuarioDAO.procuraUsuario(usuario.getLogin(), usuario.getSenha());
		
		if (!users.iterator().hasNext()) {
			throw new DefaultException("Usuário ou senha incorretos!");
		}
		else {
			usuario = users.iterator().next();
		}
		
	}
	
	
}
