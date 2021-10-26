package br.com.healthtrack.DAO;

import java.util.List;

import br.com.healthtrack.entity.PhysicalActivity;

public interface PhysicalActivityDAO {
  List<PhysicalActivity> getAll();

  void create(PhysicalActivity produto);
}
