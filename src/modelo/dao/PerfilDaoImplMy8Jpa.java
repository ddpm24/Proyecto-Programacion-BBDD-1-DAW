package modelo.dao;

import java.util.List;

import modelo.entidades.Perfil;

public class PerfilDaoImplMy8Jpa extends AbstractDaoImplMy8Jpa implements PerfilDao {

	@Override
	public boolean alta(Perfil obj) {
		try {
			tx.begin();
				em.persist(obj);
			tx.commit();
			return true;
		}catch(Exception e) {
		    e.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean eliminar(Integer clave) {
		try {
			Perfil perfil = buscarUno(clave);
			if (perfil != null) {
				tx.begin();
					em.remove(perfil);
				tx.commit();
				return true;
			}else
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean modificar(Perfil obj) {
		try {
			Perfil perfil = buscarUno(obj.getIdPerfil());
			if (perfil != null) {
				tx.begin();
					em.persist(perfil);
				tx.commit();
				return true;
			}else
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Perfil buscarUno(Integer clave) {
		return em.find(Perfil.class, clave);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Perfil> buscarTodos() {
		jpql = "select c from Perfil c";
		return em.createQuery(jpql).getResultList();
	}


}
