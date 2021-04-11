package com.jiawa.jiawa.wiki.resp;

public class EbookResp {
    private Long id;

    private String name;

    private Long categoryid1;

    private Long categoryid2;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer voteCount;

    private Integer viewCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryid1() {
        return categoryid1;
    }

    public void setCategoryid1(Long categoryid1) {
        this.categoryid1 = categoryid1;
    }

    public Long getCategoryid2() {
        return categoryid2;
    }

    public void setCategoryid2(Long categoryid2) {
        this.categoryid2 = categoryid2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", categoryid1=").append(categoryid1);
        sb.append(", categoryid2=").append(categoryid2);
        sb.append(", description=").append(description);
        sb.append(", cover=").append(cover);
        sb.append(", docCount=").append(docCount);
        sb.append(", voteCount=").append(voteCount);
        sb.append(", viewCount=").append(viewCount);
        sb.append("]");
        return sb.toString();
    }
}