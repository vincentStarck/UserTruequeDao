package vincent.starck.projects.model;

import java.util.Date;

public class ItemTrueque {
	
	private String name;
	private Date createDate;
	private Date updateDate;
	private String base64Data;
	private String fileType;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @return the base64Data
	 */
	public String getBase64Data() {
		return base64Data;
	}
	/**
	 * @param base64Data the base64Data to set
	 */
	public void setBase64Data(String base64Data) {
		this.base64Data = base64Data;
	}
	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}
	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	

}
