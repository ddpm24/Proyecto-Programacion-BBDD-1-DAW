package modelo.dao;

import java.util.List;

import modelo.entidades.Producto;
import modelo.entidades.ProyectoConEmpleado;

public class ProductoDaoImplMy8Jpa extends AbstractDaoImplMy8Jpa implements ProductoDao {

	@Override
	public boolean alta(Producto obj) {
		try {
			tx.begin();
			em.persist(obj);
			tx.commit();
			return true;
		}catch(Exception e) {
		    e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean eliminar(Integer clave) {
		try {
			Producto producto = buscarUno(clave);
			if (producto != null) {
				tx.begin();
				em.remove(producto);
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
	public boolean modificar(Producto obj) {
		try {
			Producto producto = buscarUno(obj.getIdProducto());
			if (producto != null) {
				tx.begin();
				em.persist(producto);
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
	public Producto buscarUno(Integer clave) {
		return em.find(Producto.class, clave);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> buscarTodos() {
		jpql = "select p from Producto p";
		query = em.createQuery(jpql);
		return query.getResultList();
	}

	

}
