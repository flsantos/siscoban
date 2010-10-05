package br.com.siscoban.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.siscoban.pojos.Usuario;

public class UsuarioDAO {
	
	private Session session;
	
	public UsuarioDAO (Session session) {
		this.session = session;
	}
	
	public void salva(Usuario p) {
		this.session.save(p);
	}
	public void remove(Usuario p) {
		this.session.delete(p);
	}
	public Usuario procura(Long id) {
		return (Usuario) this.session.load(Usuario.class, id);
	}
	
	
	public List<Usuario> procuraEspecifica(String campo, String valor) {
		@SuppressWarnings("unchecked")
		List<Usuario> list = (List<Usuario>) session.createCriteria(Usuario.class)
							.add(Restrictions.eq(campo, valor)).list();
		return list;  

	}
	
	public List<Usuario> procuraUsuario (String login, char[] senha) {
		
		Criteria criteria = session.createCriteria(Usuario.class);
		criteria.add(Restrictions.eq("login", login));
		criteria.add(Restrictions.eq("senha", senha));
		List<Usuario> list = criteria.list();
					  
		return list;
	}
	
	public void atualiza(Usuario p) {
		this.session.update(p);
	}


}
