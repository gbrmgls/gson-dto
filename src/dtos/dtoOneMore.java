package dtos;

public class dtoOneMore {
	public int Id = -1;
	public String RequestSource;
	public String RequestType;
	public String OriginalFileName;
	public String FileName;
	public String FileExtension;
	public String FileSize;

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

	public String getFileExtension() {
		return FileExtension;
	}

	public void setFileExtension(String fileExtension) {
		FileExtension = fileExtension;
	}

	public String getFileSize() {
		return FileSize;
	}

	public void setFileSize(String fileSize) {
		FileSize = fileSize;
	}
}
