package servlet.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PlayPenHandler extends Handler{
	private static Logger logger = Logger.getLogger(PlayPenHandler.class);

	@Override
	public void execute() throws Exception {
		logger.debug("-->BlogHandler");
		String methodName =(String)this.request.getParameter("methodName");
		if(methodName!=null){
			logger.debug("methodName:"+methodName);
			if(methodName!=null){
				Method method =null;
				method = this.getClass().getDeclaredMethod(methodName);
				method.invoke(this);
			}
		}
	}
	private void getObj() throws ServletException, IOException, JSONException{
		JSONObject jsonObject = new JSONObject();

		
		jsonObject.put("errorCode","ddddd");
		jsonObject.put("blogId","ddd");
		this.response.setCharacterEncoding("UTF-8");
		PrintWriter pw=this.response.getWriter();
		pw.write(jsonObject.toString());
		pw.close();
		//logger.debug("-->addBlogContent");
	}
	private void getList() throws JSONException, IOException{
		JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
		jsonObject.put("att1", "val1");
		jsonObject.put("att2", "val2");
		jsonArray.put(jsonObject);
        this.response.setCharacterEncoding("UTF-8");
        PrintWriter pw=this.response.getWriter();
        pw.write( jsonArray!=null? jsonArray.toString() : "");
        pw.close();
	}


	
}
