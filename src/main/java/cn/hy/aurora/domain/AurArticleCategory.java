package cn.hy.aurora.domain;

/**
 * @author hy
 */
public class AurArticleCategory {
    private Integer categoryId;

    private Integer categoryParent;

    private String categoryName;

    private Integer categoryCreate;

    private String categoryCreateDate;

    private Boolean categoryDeleted;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryParent() {
        return categoryParent;
    }

    public void setCategoryParent(Integer categoryParent) {
        this.categoryParent = categoryParent;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategoryCreate() {
        return categoryCreate;
    }

    public void setCategoryCreate(Integer categoryCreate) {
        this.categoryCreate = categoryCreate;
    }

    public String getCategoryCreateDate() {
        return categoryCreateDate;
    }

    public void setCategoryCreateDate(String categoryCreateDate) {
        this.categoryCreateDate = categoryCreateDate == null ? null : categoryCreateDate.trim();
    }

    public Boolean getCategoryDeleted() {
        return categoryDeleted;
    }

    public void setCategoryDeleted(Boolean categoryDeleted) {
        this.categoryDeleted = categoryDeleted;
    }
}