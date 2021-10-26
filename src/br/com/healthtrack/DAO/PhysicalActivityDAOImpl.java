package br.com.healthtrack.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.JDBC.DBManager;
import br.com.healthtrack.entity.PhysicalActivity;

public class PhysicalActivityDAOImpl implements PhysicalActivityDAO {
  private Connection connection;
  PreparedStatement pstmt = null;

  public List<PhysicalActivity> getAll() {
    List<PhysicalActivity> physicalActivities = new ArrayList<PhysicalActivity>();
    try {
      connection = DBManager.getConnection();
      pstmt = connection.prepareStatement("SELECT * FROM physical_activities");

      ResultSet result = pstmt.executeQuery();

      while (result.next()) {
        PhysicalActivity physicalActivity = new PhysicalActivity();
        physicalActivity.setId(result.getInt("id"));
        physicalActivity.setName(result.getString("name"));
        physicalActivity.setDuration(Integer.parseInt(result.getString("duration")));
        double d = Double.parseDouble(result.getString("calories"));
        physicalActivity.setCalories(d);

        physicalActivities.add(physicalActivity);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        pstmt.close();
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return physicalActivities;
  }

  public void create(PhysicalActivity physicalActivity) {
    try {
      connection = DBManager.getConnection();
      pstmt = connection
          .prepareStatement("INSERT INTO physical_activities (name, duration, calories) VALUES (?, ?, ?)");
      pstmt.setString(1, physicalActivity.getName());
      pstmt.setInt(2, physicalActivity.getDuration());
      pstmt.setDouble(3, physicalActivity.getCalories());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        pstmt.close();
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
