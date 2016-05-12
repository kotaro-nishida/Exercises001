package controllers;

import play.*;


import play.data.Form;
import play.mvc.*;

import views.html.*;

import static play.data.Form.form;

import java.util.*;

import models.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        List<Message> datas = Message.find.all();
        return ok(index.render("ホーム画面", datas));
    }

    public static Result add(){
        return ok(add.render("新規画面", new Form(Message.class)));
    }

    public static Result addcreate(){

    	Form<Message> addData = form(Message.class).bindFromRequest();
    	if( !addData.hasErrors() ){
    		Message data = addData.get();
    		data.postdate = new Date();
    		data.save();
    		return redirect(controllers.routes.Application.index());
    	}else {
            return badRequest(add.render("ERROR", addData));
        }
    }

    public static Result setItem(){
    	Form<Message> f = new Form(Message.class).bindFromRequest();
		return ok(item.render("ID検索だよ",f));
    }

    public static Result edit(){
    	List<Message> datas = Message.find.all();
    	Form<Message> updateData = form(Message.class).bindFromRequest();
    	if( !updateData.hasErrors() ){
    		Message msg = updateData.get();
    		// IDと一致チェック
    		for( int i = 0; i < datas.size();i++ ){
    			if( msg.id == datas.get(i).id){
    				Form<Message> update = new Form(Message.class).bindFromRequest();
    				Message message = update.get();
    				message.id = datas.get(i).id;
    				message.name = datas.get(i).name;
    				message.mail = datas.get(i).mail;
    				message.message = datas.get(i).message;
    				return ok(edit.render("編集します。",update));
    			}
    		}
    	}else{
    		return ok(item.render("ERROR",updateData));
    	}
    	datas = Message.find.all();
    	return ok(index.render("ホーム画面",datas));

    }

    public static Result editcreate(){
    	// フォームからのデータ受け取り
    	Form<Message> updateData = form(Message.class).bindFromRequest();
    	if( !updateData.hasErrors() ){

    		Message data = updateData.get();
    		data.postdate = new Date();
    		System.out.println("postdate = " + data.postdate);
    		data.update();
    		return redirect(controllers.routes.Application.index());
    	}
    	List<Message> datas = Message.find.all();
    	return ok(index.render("ホーム画面",datas));
    }

    public static Result delete(){
    	Form<Message> f = new Form(Message.class).bindFromRequest();
		return ok(delete.render("ID検索だよ",f));
    }

    public static Result deletecreate(){
    	// フォームからのデータ受け取り
       	List<Message> datas = Message.find.all();
    	Form<Message> deleteData = form(Message.class).bindFromRequest();
    	if( !deleteData.hasErrors() ){
    		Message msg = deleteData.get();
    		// IDと一致チェック
    		for( int i = 0; i < datas.size();i++ ){
    			if( msg.id == datas.get(i).id){

		    		Message data = deleteData.get();
					datas.get(i).delete();
		    		return redirect(controllers.routes.Application.index());
    			}
    		}
    	}
    	datas = Message.find.all();
    	return ok(index.render("ホーム画面",datas));
    }

    public static Result find(){
        return ok(find.render("投稿の検索",new Form(Message.class)));
    }

    public static Result findcreate(){
    	// フォームからのデータ受け取り

    	Form<Message> findData = form(Message.class).bindFromRequest();
    	if( !findData.hasErrors() ){
    		Message msg = findData.get();
    		List<Message> datas = (List<Message>) Message.find.where().eq("name", msg.name).findList();
    		return ok(index.render("検索結果",datas));
    	}
    	return redirect(controllers.routes.Application.index());
    }
}


