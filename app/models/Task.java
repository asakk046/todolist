package models;

import java.util.*;
/**
*added this as part of the jpa and db, needed to query the db
*/
import play.db.ebean.*;
/**
*given in the tutorial
*/
import play.data.validation.Constraints.*;

import javax.persistence.*;
import play.db.*;



@Entity
public class Task extends Model {

  @Id
  public Long id;

  @Required
  public String label;
  public static Finder<Long,Task> find = new Finder(Long.class, Task.class);
  
  public static List<Task> all() {
  return find.all();
  }
  
  public static void create(Task task) {
  	task.save();
  }
  
  public static void delete(Long id) {
  	find.ref(id).delete();
  }
    
}