package br.com.healthtrack;

import java.time.LocalDate;

import br.com.healthtrack.DAO.PhysicalActivityDAO;

/**
 * Classe principal.
 * 
 * @author LiftOff
 * @version 1.0
 */
public class Execute {

	public static void main(String[] args) {
		User user = new User("carlos.armstrong@fiap.com.br", "123456", 60.8, 1.60, "Carla", LocalDate.of(1995, 07, 21));

		String startTime = "21/08/2021 13:00";
		String endTime = "21/08/2021 13:45";
		PhysicalActivity poleDance = new PhysicalActivity("Pole Dance", 3600, 1000.0);

		PhysicalActivityUser physicalActivityUser = new PhysicalActivityUser(poleDance, user);
		physicalActivityUser.startActivity(startTime);
		physicalActivityUser.endActivity(endTime);

		System.out.println(physicalActivityUser.generateResume());

		// Fase 6 - Cap 02
		PhysicalActivityDAO dao = new PhysicalActivityDAO();
		Execute.createFakePhysicalActivity(dao, 30);
		Execute.createFakePhysicalActivity(dao, 30);

		dao.getAll().forEach(task -> System.out.println(task.toString()));
	}

	public static void createFakePhysicalActivity(PhysicalActivityDAO dao, int len) {
		for (int i = 0; i < len; i++) {
			int n = (dao.getAll().size() + 1);
			String name = "Atividade física " + n;
			dao.create(name, 7 * n, (8.3 * n) * 1.0);
		}
	}
}
