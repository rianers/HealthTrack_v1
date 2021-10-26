package br.com.healthtrack;

import br.com.healthtrack.DAO.PhysicalActivityDAO;
import br.com.healthtrack.DAO.PhysicalActivityDAOImpl;
import br.com.healthtrack.entity.PhysicalActivity;

/**
 * Classe principal.
 * 
 * @author LiftOff
 * @version 1.0
 */
public class Execute {

	public static void main(String[] args) {
		try {
			PhysicalActivityDAO dao = new PhysicalActivityDAOImpl();
			Execute.createFakePhysicalActivity(dao, 3);

			dao.getAll().forEach(physicalActivity -> System.out.println(physicalActivity.toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createFakePhysicalActivity(PhysicalActivityDAO dao, int len) {
		for (int i = 0; i < len; i++) {
			int n = (dao.getAll().size() + 1);
			String name = "Atividade física " + n;
			PhysicalActivity pha = new PhysicalActivity(name, 7 * n, (8.3 * n) * 1.0);
			dao.create(pha);
		}
	}
}
