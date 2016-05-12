package models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.*;

import com.avaje.ebean.annotation.CreatedTimestamp;

import play.db.ebean.*;
import play.data.validation.*;
import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Pattern;
import play.data.validation.Constraints.Required;

@Entity
public class Message extends Model {

	@Id
	public long id = 0;

	@Required(message = "必須項目です。")
	public String name = "test";

	@Email(message = "Email")
	public String mail;

	@Pattern(value = "^[a-zA-Z0-9]+$", message = "半角英数字のみで入力してください。")
	public String message;

	@CreatedTimestamp
	public Date postdate;

	public static Finder<Long, Message> find =
		new Finder<Long, Message>(Long.class, Message.class);

  @Override
  public String toString() {
    return ("[id:" + id + ", name:" + name + ",mail:" + mail +
      ",message:" + message + ",date:" + postdate + "]");
  }
}