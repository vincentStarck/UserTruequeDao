package vincent.starck.projects.model;

import java.util.Date;
import java.util.List;

public class Item {
	private String description; 
	private Date createDate;
	private Date updateDate;
	private List<ItemTrueque> itemsTrueque;
	private Category category;
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the itemsTrueque
	 */
	public List<ItemTrueque> getItemsTrueque() {
		return itemsTrueque;
	}
	/**
	 * @param itemsTrueque the itemsTrueque to set
	 */
	public void setItemsTrueque(List<ItemTrueque> itemsTrueque) {
		this.itemsTrueque = itemsTrueque;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	

}
