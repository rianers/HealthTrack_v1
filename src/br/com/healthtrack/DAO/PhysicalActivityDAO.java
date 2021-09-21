package br.com.healthtrack.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.PhysicalActivity;

public class PhysicalActivityDAO {
  private List<PhysicalActivity> physicalActivities = new ArrayList<PhysicalActivity>();

  public List<PhysicalActivity> getAll() {
    return this.physicalActivities;
  }

  public void create(String name, int duration, Double calories) {
    int id = this.physicalActivities.size() + 1;
    PhysicalActivity activity = new PhysicalActivity(name, duration, calories);
    activity.setId(id);

    this.physicalActivities.add(activity);
  }
}
