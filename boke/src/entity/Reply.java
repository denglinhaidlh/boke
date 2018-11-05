package entity;

import java.util.Date;

public class Reply {
private int replyid;
private String content;
private Date time;
private int articleid;
private String username;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getReplyid() {
	return replyid;
}
public void setReplyid(int replyid) {
	this.replyid = replyid;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public int getArticleid() {
	return articleid;
}
public void setArticleid(int articleid) {
	this.articleid = articleid;
}
	
}
