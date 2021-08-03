package conversionTest;

import com.google.gson.Gson;

import domains.domain1;
import dtos.dtoOneLess;
import dtos.dtoOneMore;
import dtos.dtoSame;

public class Main {
	static String json = "{\"RequestSource\": \"reqsource\",\"RequestType\": \"reqtype\",\"OriginalFileName\": \"orgfilename\",\"FileName\": \"filename\",\"FileExtension\": \"fileext\"}";

	public static void main(String[] args) {
		Gson gson = new Gson();
		domain1 domainObj = gson.fromJson(json.toString(), domain1.class);
		String domainObjStr = gson.toJson(domainObj);
		
		dtoSame dtoSameObj = gson.fromJson(domainObjStr, dtoSame.class);
		dtoOneLess dtoOneLessObj = gson.fromJson(domainObjStr, dtoOneLess.class);
		dtoOneMore dtoOneMoreObj = gson.fromJson(domainObjStr, dtoOneMore.class);
		
		System.out.println(domainObj.getFileName());
		System.out.println(dtoSameObj.getFileName());
		System.out.println(dtoOneMoreObj.getFileSize());
		System.out.println(dtoOneLessObj.getFileName());
	}
}
