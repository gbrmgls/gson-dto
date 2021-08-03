package dtos;

public class dtoOneLess {
	public int Id = -1;
	public String RequestSource;
	public String RequestType;
	public String OriginalFileName;
	public String FileName;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getRequestSource() {
		return RequestSource;
	}

	public void setRequestSource(String requestSource) {
		RequestSource = requestSource;
	}

	public String getRequestType() {
		return RequestType;
	}

	public void setRequestType(String requestType) {
		RequestType = requestType;
	}

	public String getOriginalFileName() {
		return OriginalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		OriginalFileName = originalFileName;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

}
